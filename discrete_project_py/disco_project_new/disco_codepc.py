
import pandas as pd
import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt
import networkx as nx
a=int(input("Enter dataset numer: "))
if a==1:
    df = pd.read_csv("C:\\Users\\utkar\\OneDrive\\Desktop\\disco_project\\data_set - Sheet1.csv")
elif a==2:
    df = pd.read_csv("C:\\Users\\utkar\\OneDrive\\Desktop\\disco_project\\data_set - Sheet2.csv")
elif a==3:
    df = pd.read_csv("C:\\Users\\utkar\\OneDrive\\Desktop\\disco_project\\data_set - Sheet3.csv")
elif a==4:
    df = pd.read_csv("C:\\Users\\utkar\\OneDrive\\Desktop\\disco_project\\data_set - Sheet4.csv")
elif a==5:
    df = pd.read_csv("C:\\Users\\utkar\\OneDrive\\Desktop\\disco_project\\data_set - Sheet5.csv")

df.head()

df.loc[df['CATEGORY'] == 'X1', 'CATEGORY'] = 0.5
df.loc[df['CATEGORY'] == 'X2', 'CATEGORY'] = 1
df.loc[df['CATEGORY'] == 'X3', 'CATEGORY'] = 1.5


# In[5]:


'''
for _ in range(30):
    random_number = np.random.randint(1, 31)
    df.loc[df['Rank']==0,'Rank'] = random_number
    for i in range(1,30):
        ndf=df.iloc[i:]
        if ndf['Rank'].isin([random_number]).any():
            a=random_number
            random_number = np.random.randint(1, 31)
            ndf.loc[df['Rank']==a,'Rank'] = random_number
            
ndf=df
df
''' 
random_ranks = np.random.permutation(np.arange(1, 31))
df['Rank'] = random_ranks
df.sort_values('Rank',inplace=True)


# In[6]:


df


# In[7]:


proff_dict={}
for i in range(df.shape[0]):
    proff_list=df.iloc[i].tolist()
    proff_dict[proff_list[0]]=proff_list[1:]
print(proff_dict)


# In[8]:


FDC ={'FDC1': 1, 'FDC2': 1, 'FDC3': 1, 'FDC4': 1, 'FDC5': 1, 'FDC6': 1, 'FDC7': 1, 'FDC8': 1, 'FDC9': 1, 'FDC10': 1, 'FDC11': 1}
HDC={'HDC1': 1, 'HDC2': 1, 'HDC3': 1, 'HDC4': 1}
FDE = {'FDE1': 1, 'FDE2': 1, 'FDE3': 1, 'FDE4': 1, 'FDE5': 1, 'FDE6': 1}
HDE = {'HDE1': 1, 'HDE2': 1, 'HDE3': 1, 'HDE4': 1}
#courses_offered=['FDC','HDC','FDE','HDE']


# In[9]:


allot_dict = {key: [] for key in set(FDC) | set(HDC) | set(FDE) | set(HDE)}

print(allot_dict)


# In[10]:


def assign_course(prof_name,course_name):
    for i in allot_dict:
        if i==course_name:
            allot_dict[i].append(prof_name)    


# In[11]:


def check_total(x):
    total=0
    for i in x:
        total+=x[i]
    if total==0:
        return True
    else:
        return False        


# In[12]:


def preference_priority(x):
    if x==FDC:
        y='FDC'
    elif x==HDC:
        y='HDC'
    elif x==FDE:
        y='FDE'
    elif x==HDE:
        y='HDE'
    for i in range(2,12):
        for name in proff_dict:
            if proff_dict[name][i].startswith(y):
                course_name=proff_dict[name][i]
                if course_name in x:
                    if x[course_name] in [0.5,1] and proff_dict[name][1] in [0.5,1.5]:
                        assign_course(name,course_name)
                        x[course_name]-=0.5
                        proff_dict[name][1]-=0.5
                    elif x[course_name]==1 and proff_dict[name][1] in [1,1.5]:
                        assign_course(name,course_name)
                        x[course_name]=0
                        proff_dict[name][1]-=1
        if check_total(x):
            break


# In[13]:


preference_priority(FDC)
preference_priority(HDC)
preference_priority(FDE)
preference_priority(HDE)


# In[14]:


FDC


# In[15]:


HDC


# In[16]:


FDE


# In[17]:


HDE


# In[24]:


allot_dict


# In[19]:


df = pd.DataFrame(allot_dict.items(), columns=['Courses', 'Professors'])
df[['Professor1', 'Professor2']] = pd.DataFrame(df['Professors'].tolist(),index=df.index)
df = df.drop(columns='Professors')
def custom_sort(course):
    letters = course[:3]
    number = int(course[3:])
    category_order = {'FDC': 1, 'HDC': 2, 'FDE': 3, 'HDE': 4}
    return (category_order[letters], number)

df['sort_key'] = df['Courses'].apply(custom_sort)
df = df.sort_values('sort_key').drop(columns='sort_key')
df = df.reset_index(drop=True)


# In[20]:


def red(x):
    if pd.isna(x):
        return 'font-weight: bold; color: red'
    else:
        return ''

styled_df = df.style.applymap(red)
styled_df.to_excel('styled_dataset.xlsx', index=False)
styled_df


# In[21]:


professor_counts = df[['Professor1', 'Professor2']].count(axis=1)

plt.figure(figsize=(10, 6))
plt.bar(df['Courses'], professor_counts, color='skyblue')
plt.xlabel('Courses')
plt.ylabel('Number of Professors')
plt.title('Number of Professors per Course')
plt.xticks(rotation=45, ha='right')
plt.tight_layout()
plt.show()


# In[ ]:





# In[22]:


B = nx.Graph()

# Add nodes for Professor1 and Professor2
B.add_nodes_from(df['Professor1'], bipartite=0, label='Professor1')
B.add_nodes_from(df['Professor2'].dropna(), bipartite=0, label='Professor2')

# Add nodes for Courses
B.add_nodes_from(df['Courses'], bipartite=1, label='Course')

# Add edges between Courses and Professor1/Professor2
for i, row in df.iterrows():
    if row['Professor2']:
        B.add_edge(row['Courses'], row['Professor2'])
    B.add_edge(row['Courses'], row['Professor1'])

# Get bipartite layout
pos = nx.bipartite_layout(B, df['Professor1'], align='horizontal')

# Plot the bipartite graph with adjusted parameters
plt.figure(figsize=(12, 8))

# Plot nodes
node_size = 800
for node, (x, y) in pos.items():
    color = 'skyblue' if node in df['Courses'].values else 'orange'
    plt.scatter(x, y, color=color, s=node_size, label=node, edgecolors='black', linewidths=1)
    plt.text(x, y, node, color='black', ha='center', va='center', fontsize=8)

# Plot edges
edge_width = 1.5
for edge in B.edges():
    x = [pos[edge[0]][0], pos[edge[1]][0]]
    y = [pos[edge[0]][1], pos[edge[1]][1]]
    plt.plot(x, y, color='gray', linestyle='--', linewidth=edge_width)

# Adjust labels and legend
plt.title("Bipartite Graph: Courses to Professors")
plt.legend()
plt.axis('off')  # Hide axis labels

plt.show()


# In[ ]:





# In[ ]:




