#include <bits/stdc++.h>
using namespace std;

void printVector(const std::vector<int>& vec) {
    for (int num : vec)
        cout << num << " ";
        cout << std::endl;
}

void heapify(vector<int> &arr, int n, int i) {
    int largest = i;
    int l = 2*i + 1;
    int r = 2*i + 2;
    if(l < n && arr[l] > arr[largest]) {
        largest = l;
    }
    if(r < n && arr[r] > arr[largest]) {
        largest = r;
    }
    if(largest != i) {
        swap(arr[i], arr[largest]);
        heapify(arr, n, largest);
    }
}

void heapifymin(vector<int> &arr, int n, int i) {
    int smallest = i;
    int l = 2*i + 1;
    int r = 2*i + 2;
    if(l < n && arr[l] < arr[smallest]) {
        smallest = l;
    }
    if(r < n && arr[r] < arr[smallest]) {
        smallest = r;
    }
    if(smallest != i) {
        swap(arr[i], arr[smallest]);
        heapifymin(arr, n, smallest);
    }
}

vector<int> buildHeap(vector<int> &arr,int n){
    for(int i = n/2-1; i>=0; i--){
        heapify(arr, n, i);
    }
    return arr;
}

void buildMinHeap(vector<int> &arr, int n) {
    // Start from the last non-leaf node
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapifymin(arr, n, i);
    }
}

void heapsort(vector<int> &arr, int n){
    arr = buildHeap(arr, n);
    for(int i = n-1; i>0; i--){
        swap(arr[0], arr[i]);
        heapify(arr, i, 0);
    }
}

void deleteRoot(vector<int> &arr, int n){
    swap(arr[0], arr[n-1]);
    heapify(arr, n-1, 0);
}

void insert(vector<int> &arr, int n, int key){
    arr.push_back(key);
    int i = n;
    n = n+1;
    while(i > 0 && arr[(i-1)/2] < arr[i]){
        swap(arr[i], arr[(i-1)/2]);
        i = (i-1)/2;
    }
}

int pop(vector<int> &heap)
{
    if(heap.size() == 0) return -1;
    int ans = heap[0];
    swap(heap[0],heap[heap.size()-1]);
    heap.pop_back();
    heapify(heap, heap.size(), 0);
    // Write you code here.
    return ans;
}

void push(vector<int> &heap, int x){
          heap.push_back(x);
           int pos=heap.size()-1;
           while(pos>0)
           {
               int parent = (pos-1)/2;
               if(heap[pos] > heap[parent])
               {
                   swap(heap[parent],heap[pos]);
                   pos=parent;
              }
             else
             {
                 break;
             }
         }
     }

int findKthLargest(vector<int>& nums, int k) {
    //     int n = nums.size();
    //     nums = buildHeap(nums,n);
    //     for(int i = n-1, j=1; i>0; i--,j++){
    //     if(j==k) return nums[0];
    //     swap(nums[0], nums[i]);
    //     heapify(nums, i, 0);
    // }
    // return nums[0];
        priority_queue<int>pq ;
        int n = nums.size()  ;
        for (int i = 0; i < nums.size(); i++) {
            pq.push(nums[i])  ;
        }
        int f = k - 1 ;
        while (f > 0) {
            pq.pop()  ;
            f-- ;
        }
    return pq.top();
    }

    void kth_Smallest_MinHeap(vector<int>&arr, int k) {
        priority_queue<int, vector<int>, greater<int>>pq ;
        int n = arr.size()  ;
        for (int i = 0; i < arr.size(); i++) {
            pq.push(arr[i])  ;
        }
        int f = k - 1 ;
        while (f > 0) {
            pq.pop()  ;
            f-- ;
        }
        return pq.top();
    }
//replaceelementsbyrank
    int main()
{
	int n = 6;
	int arr[n] = {20, 15, 26, 2, 98, 6};
	map<int, int>mp;
	int temp = 1;
	int brr[n];
	for (int i = 0; i < n; i++) {
		brr[i] = arr[i];
	}
	sort(brr, brr + n);
	for (int i = 0; i < n; i++) {
		//if element is previously not store in the map
		if (mp[brr[i]] == 0) {
			mp[brr[i]] = temp;
			temp++;
		}
	}
	for (int i = 0; i < n; i++) {
		cout << mp[arr[i]] << " ";
	}
}






int main(){
    int n;
    cin >> n;

    vector<int> vec(n);
    for(int i = 0; i<n; i++){
        cin >> vec[i];
    }

    // int m;
    // cin >> m;
    // heapsort(vec, n);
    // insert(vec, n, m);
    buildHeap(vec, n);
    printVector(vec);
    return 0;
}

// class minHeap {
// public:


//    int *heap;
//    int heapsize;
//     minHeap(int c) {
//        heapsize=0;
//        heap=new int[c];
//     }


//     int extractMinElement() {
//      if(heapsize<1)return -1;
//      if(heapsize==1)
//      {
//          heapsize--;
//          return heap[0];
//      }
//      int ans=heap[0];
//      heapsize--;
//      heap[0]=heap[heapsize];
//      heap[heapsize]=0;
//      heapify(0);
//      return ans;
//     }


//     void deleteElement(int ind) {
//         if(ind<heapsize)
//         {
//             decreaseKey(ind);
//             extractMinElement();
//         }
//     }


//     void insert(int val) {
//         int ind=heapsize;
//         heapsize++;
//         heap[ind]=val;
//         while(ind>0)
//         {
//             if(heap[ind]<heap[parent(ind)])
//             {
//                 swap(heap[ind],
//                     heap[parent(ind)]);
//                 ind=parent(ind);
//             }
//             else break;
//         }
//     }
    
//     //created sepearet fucn for just simplicity
//     void heapify(int ind)
//     {
//         int smallest=ind;
//         int l=lchild(ind);
//         int r=rchild(ind);
        
//         if(l<heapsize && 
//           heap[smallest]>heap[l])smallest=l;
//         if(r<heapsize &&
//           heap[smallest]>heap[r])smallest=r;
//         if(smallest!=ind)
//         {
//             swap(heap[ind],heap[smallest]);
//             heapify(smallest);
//         }
//     }


//     void decreaseKey(int ind)
//     {
//         heap[ind]=INT_MIN;
//         while(ind>0)
//         {
//             if(heap[ind]<heap[parent(ind)])
//             {
//                 swap(heap[ind],
//                      heap[parent(ind)]);
//                 ind=parent(ind);
//             }
//             else break;
//         }
//     }
    
//     int parent(int i)
//     {
//         return (i-1)/2;
//     }
//     int rchild(int i)
//     {
//         return 2*i+2;
//     }
//     int lchild(int i)
//     {
//         return 2*i+1;
//     }
// };


// class minHeap {
// public:
//     vector<int> heap;
//     int size, capacity;
//     // Constructor for the class.
//     minHeap(int cap) {
//         // Write your code here.
//         heap.resize(cap);
//         size = 0;
//         capacity = cap;
//     }

//     void heapify(int i) {
//         int smallest = i;
//         int li = 2*i + 1, ri = 2*i + 2;
//         if(li < size && heap[li] < heap[smallest]) {
//             smallest = li;
//         }

//         if(ri < size && heap[ri] < heap[smallest]) {
//             smallest = ri;
//         }

//         if(i != smallest) {
//             swap(heap[i],heap[smallest]);
//             heapify(smallest);
//         }
//     }

//     // Implement the function to remove minimum element.
//     int extractMinElement() {
//         // Write you code here.
//         if(size == 0) return -1;
//         int ans = heap[0];
//         swap(heap[0],heap[size-1]);
//         size--;
//         heapify(0);
//         return ans;
//     }

//     // Implement the function to delete an element.
//     void deleteElement(int ind) {
//         // Write you code here.
//         if(ind >= size) return ;
//         swap(heap[ind],heap[size-1]);
//         size--;
//         heapify(ind);
//     }

//     // Implement the function to insert 'val' in the heap.
//     void insert(int val) {
//         // Write you code here.
//         if(size == capacity) return ;
//         heap[size] = val;
//         size++;
//         int ind = size-1;
//         while(ind >= 0) {
//             int parent = (ind-1)/2;
//             if(heap[parent] > heap[ind]) {
//                 swap(heap[parent],heap[ind]);
//                 ind = parent;
//             }else break;
//         }
//     }
// };