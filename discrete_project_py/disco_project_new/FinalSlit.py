import pandas as pd
import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt
import streamlit as st

def load_dataset(dataset_num):
    dataset_num = st.slider("Choose a dataset:", 1, 9, 1)
    file_path = f"data_set - Sheet{dataset_num}.csv"
    df = pd.read_csv(file_path)
    return df

def process_dataset(df):
    df.loc[df['CATEGORY'] == 'X1', 'CATEGORY'] = 0.5
    df.loc[df['CATEGORY'] == 'X2', 'CATEGORY'] = 1
    df.loc[df['CATEGORY'] == 'X3', 'CATEGORY'] = 1.5

    random_ranks = np.random.permutation(np.arange(1, df.shape[0]+1))
    df['Rank'] = random_ranks
    df.sort_values('Rank', inplace=True)

    return df

def create_preference_dict(df):
    proff_dict = {}
    for i in range(df.shape[0]):
        proff_list = df.iloc[i].tolist()
        proff_dict[proff_list[0]] = proff_list[1:]

    return proff_dict

def create_allot_dict(FDC, HDC, FDE, HDE):
    allot_dict = {key: [] for key in set(FDC) | set(HDC) | set(FDE) | set(HDE)}
    return allot_dict

def assign_course(prof_name, course_name, allot_dict):
    for i in allot_dict:
        if i == course_name:
            allot_dict[i].append(prof_name)

def check_total(x):
    total = 0
    for i in x:
        total += x[i]
    return total == 0

def preference_priority(x, FDC, HDC, FDE, HDE, proff_dict, allot_dict, only_once):
    if x == FDC:
        y = 'FDC'
    elif x == HDC:
        y = 'HDC'
    elif x == FDE:
        y = 'FDE'
    elif x == HDE:
        y = 'HDE'
    
    for i in range(2, 12):
        for name in proff_dict:
            if proff_dict[name][i].startswith(y):
                course_name = proff_dict[name][i]
                if course_name in x:
                    if x[course_name] in [0.5, 1] and proff_dict[name][1] in [0.5, 1.5]:
                        if proff_dict[name][1] in [0.5, 1.5] and course_name not in only_once:
                            assign_course(name, course_name, allot_dict)
                            x[course_name] -= 0.5
                            proff_dict[name][1] -= 0.5
                        elif proff_dict[name][1] == 1.5 and course_name in only_once:
                            assign_course(name, course_name, allot_dict)
                            x[course_name] -= 1
                            proff_dict[name][1] -= 1
                    elif x[course_name] == 1 and proff_dict[name][1] in [1, 1.5]:
                        assign_course(name, course_name, allot_dict)
                        x[course_name] = 0
                        proff_dict[name][1] -= 1
        
        if check_total(x):
            break

def main():
    st.title("Course Assignment App")
    
    a = 1
    df = load_dataset(a)
    df = process_dataset(df)

    FDC = {'FDC1': 1, 'FDC2': 1, 'FDC3': 1, 'FDC4': 1, 'FDC5': 1, 'FDC6': 1, 'FDC7': 1, 'FDC8': 1, 'FDC9': 1, 'FDC10': 1, 'FDC11': 1}
    HDC = {'HDC1': 1, 'HDC2': 1, 'HDC3': 1, 'HDC4': 1}
    FDE = {'FDE1': 1, 'FDE2': 1, 'FDE3': 1, 'FDE4': 1, 'FDE5': 1, 'FDE6': 1}
    HDE = {'HDE1': 1, 'HDE2': 1, 'HDE3': 1, 'HDE4': 1}

    allot_dict = create_allot_dict(FDC, HDC, FDE, HDE)
    proff_dict = create_preference_dict(df)

    only_once = []
    for key in allot_dict:
        occurrences = df.values.flatten().tolist().count(key)
        if occurrences == 1:
            only_once.append(key)

    print("Allot Dict:", allot_dict)
    print("Proff Dict:", proff_dict)
    print("Only Once:", only_once)
    for key in proff_dict:
        for once in only_once:
            if once in proff_dict[key] and proff_dict[key][1] in [1,1.5]:
                assign_course(key,once,allot_dict)
                proff_dict[key][1]-=1
                if once.startswith("FDC"):
                    FDC[once]-=1
                elif once.startswith("HDC"):
                    HDC[once]-=1

    preference_priority(FDC, FDC, HDC, FDE, HDE, proff_dict, allot_dict, only_once)
    preference_priority(HDC, FDC, HDC, FDE, HDE, proff_dict, allot_dict, only_once)
    preference_priority(FDE, FDC, HDC, FDE, HDE, proff_dict, allot_dict, only_once)
    preference_priority(HDE, FDC, HDC, FDE, HDE, proff_dict, allot_dict, only_once)

    print("Allot Dict After Preference Priority:", allot_dict)

    for key in FDE:
        if FDE[key] == 0.5:
            FDE[key] += 0.5
            proff = allot_dict[key][0]
            allot_dict[key] = []
            proff_dict[proff][1] += 0.5

    for key in HDE:
        if HDE[key] == 0.5:
            HDE[key] += 0.5
            proff = allot_dict[key][0]
            allot_dict[key] = []
            proff_dict[proff][1] += 0.5

    print("Allot Dict After FDE and HDE Assignment:", allot_dict)

    df_result = pd.DataFrame(allot_dict.items(), columns=['Courses', 'Professors'])
    df_result[['Professor1', 'Professor2']] = pd.DataFrame(df_result['Professors'].tolist(), index=df_result.index)
    df_result = df_result.drop(columns='Professors')

    def custom_sort(course):
        letters = course[:3]
        number = int(course[3:])
        category_order = {'FDC': 1, 'HDC': 2, 'FDE': 3, 'HDE': 4}
        return (category_order[letters], number)

    df_result['sort_key'] = df_result['Courses'].apply(custom_sort)
    df_result = df_result.sort_values('sort_key').drop(columns='sort_key')
    df_result = df_result.reset_index(drop=True)

    print("Final DataFrame:", df_result)

    def red(x):
        if pd.isna(x):
            return 'font-weight: bold; color: red'
        else:
            return ''

    styled_df = df_result.style.map(red)
    styled_df.to_excel('styled_dataset.xlsx', index=False)

    st.dataframe(styled_df,1000)

    # professor_counts = df[['Professor1', 'Professor2']].count(axis=1)

    # plt.figure(figsize=(10, 6))
    # plt.bar(df['Courses'], professor_counts, color='skyblue')
    # plt.xlabel('Courses')
    # plt.ylabel('Number of Professors')
    # plt.title('Number of Professors per Course')
    # plt.xticks(rotation=45, ha='right')
    # plt.tight_layout()
    # plt.show()

    # st.pyplot()
    


if __name__ == "__main__":
    main()

    



