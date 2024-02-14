#include <bits/stdc++.h>
using namespace std;

void printVector(const std::vector<int>& vec) {
    for (int num : vec)
        cout << num << " ";
        cout << std::endl;
}

void insertionSort(int arr[], int n)
{
        for(int i=0;i<=n-1;i++){
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            swap(arr[j-1],arr[j]);
            j--;
        }
    }
}

void rec_insertion_sort(int arr[], int i, int n) {

    // Base Case: i == n.
    if (i==n) return;
        int j = i;
        while (j>0 && arr[j-1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
    }

    rec_insertion_sort(arr, i + 1, n);
}

int partition(vector<int> &arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
        while (arr[i] <= pivot && i <= high - 1) {
            i++;
        }

        while (arr[j] > pivot && j >= low + 1) {
            j--;
        }
        if (i < j) swap(arr[i], arr[j]);
    }
    swap(arr[low], arr[j]);
    return j;
}

void qs(vector<int> &arr, int low, int high) {
    if (low < high) {
        int pIndex = partition(arr, low, high);
        qs(arr, low, pIndex - 1);
        qs(arr, pIndex + 1, high);
    }
}

vector<int> quickSort(vector<int> arr) {
    qs(arr, 0, arr.size() - 1);
    return arr;
}




void selectionSort(vector<int>&arr) {
    // Write your code here.
    for(int i=0; i<arr.size(); i++){
        int temp = arr[i];
        int min = *min_element(arr.begin()+i, arr.end());
        int min_index = min_element(arr.begin()+i, arr.end()) - arr.begin();
        arr[i] = min;
        arr[min_index] = temp;
        

        }
        
    }

void bubbleSort(vector<int>& arr, int n) 
{
    //write your code here
    for(int i=n-1;i>0;i--){
        for(int j=0;j<i;j++){
            if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;

            // swap(arr[j],arr[j+1])
            ;}
        }
    }
}

void rec_bubble_sort(int arr[], int n) {
    // Base Case: range == 1.
    if (n == 1) return;

    int didSwap = 0;
    for (int j = 0; j <= n - 2; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j + 1];
            arr[j + 1] = arr[j];
            arr[j] = temp;
            didSwap = 1;
        }
    }

    // if no swapping happens.
    if (didSwap == 0) return;

    //Range reduced after recursion:
    rec_bubble_sort(arr, n - 1);
}

void merge(vector<int> &arr, int low, int mid, int high){
    int temp[high-low+1];
    int left = low;
    int right = mid+1;
    int index = 0;

    while(left<=mid && right<=high){
        if(arr[left]<=arr[right]){
            temp[index] = arr[left];
            left++;
        }
        else{
            temp[index] = arr[right];
            right++;
        }
        index++;
    }

    while(left<=mid){
        temp[index] = arr[left];
        left++;
        index++;
    }

    while(right<=high){
        temp[index] = arr[right];
        right++;
        index++;
    }

    for(int i=low; i<=high; i++){
        arr[i] = temp[i-low];
    }
}

void mergeSort(vector<int> &arr, int low, int high) {
    if(low>=high) return;
    int mid = (low+high)/2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid+1, high);
    merge(arr, low, mid, high);
}


// void mergeSort(vector<int> &arr, int low, int high){
//     if(low>=high) return;
//     int mid = (low+high)/2;
//     mergeSort(arr, low, mid);
//     mergeSort(arr, mid+1, high);

//     vector<int> temp;
//     int left = low;
//     int right = mid+1;

//     while(left<=mid && right<=high){
//         if(arr[left]<=arr[right]){
//             temp.push_back(arr[left]);
//             left++;
//         }
//         else{
//             temp.push_back(arr[right]);
//             right++;
//         }
//     }

//     while(left<=mid){
//         temp.push_back(arr[left]);
//         left++;
//     }

//     while(right<=high){
//         temp.push_back(arr[right]);
//         right++;
//     }

//     for(int i=low; i<=high; i++){
//         arr[i] = temp[i-low];
//     }
// }

int searchInsert(vector<int>& nums, int target) {
        int low=0;
        int high=nums.size();
        int mid;
        if(target>nums[high-1]){
            return high;
        }
        while(low<=high){
              mid=(low+high)/2;
            if(nums[mid]==target){  
                return mid;
            }
          
            if(target<nums[mid]){     
            high=mid-1;    
            }else{
            low=mid+1;        
            }
          
        }
         return  low;   
    }

int main()
{
    int n;
    cin >> n;
    // int arr[n];
    // for(int i = 0; i<n; i++){
    //     cin >> arr[i];
    // }

    vector<int> vec(n);
    for(int i = 0; i<n; i++){
        cin >> vec[i];
    }

    // selectionSort(vec);

    // insertionSort(arr, n);

    int low = 0; int high = n-1;
    // mergeSort(arr, low, high);
    mergeSort(vec, low, high);

    // bubbleSort(vec, n);

    // bubble_sort(arr, n);

    // rec_insertion_sort(arr, 0, n);

    // vec = quickSort(vec);

    printVector(vec);

    // for(int i = 0; i<n; i++){
    //     cout << arr[i] << " ";
    // }


    return 0;
}