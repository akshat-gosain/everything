#include <bits/stdc++.h>
using namespace std;

void printVector(const std::vector<int>& vec) {
    for (int num : vec)
        cout << num << " ";
        cout << std::endl;
}

void merge(vector<int> &count, vector<pair<int, int> > &v, int left, int mid, int right) {
        vector<pair<int, int> > tmp(right-left+1);
        int i = left;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= right) {
            // mind that we're sorting in descending order
            if (v[i].first <= v[j].first) { 
                tmp[k++] = v[j++];
            }
            else {
                // only line responsible to update count, related to problem constraint, 
                // remaining part is just regular mergeSort 
                count[v[i].second] += right - j + 1;
                tmp[k++] = v[i++];
            }
        }
        while (i <= mid) {
            tmp[k++] = v[i++];
        }
        while (j <= right) {
            tmp[k++] = v[j++];
        }
        for (int i = left; i <= right; i++)
            v[i] = tmp[i-left];
    }        

    void mergeSort(vector<int> &count, vector<pair<int, int> > &v, int left, int right) {
        if (left >= right) 
            return;

        int mid = left + (right-left)/2;
        mergeSort(count, v, left, mid);
        mergeSort(count, v, mid+1, right);
        merge(count, v, left, mid, right);
    }

int smallestElement(vector<int> &arr, int n) {
    int min = *min_element(arr.begin(), arr.end());
    return min;
}

int largestElement(vector<int> &arr, int n) {
    int max = *max_element(arr.begin(), arr.end());
    return max;
}

vector<int> getSecondOrderElements(int n, vector<int> &arr) {
    
    if(n>=4){
    auto itmin = min_element(arr.begin(), arr.end());
    arr.erase(itmin);

    auto itmax = max_element(arr.begin(), arr.end());
    arr.erase(itmax);

    vector<int> v;
    v.push_back(*max_element(arr.begin(), arr.end()));
    v.push_back(*min_element(arr.begin(), arr.end()));

    return v;}else{
        sort(arr.begin(), arr.end());
        return {arr[n-2], arr[1]};
    }

}

vector <int> sortedArray(vector <int> a, vector <int> b) {
    set <int> s;
    for(int i = 0; i<a.size(); i++){
        s.insert(a[i]);
    }
    for(int i = 0; i<b.size(); i++){
        s.insert(b[i]);
    }
    vector<int> v(s.begin(), s.end());
    // vector <int> v;
    // for(auto i = s.begin(); i!=s.end(); i++){
    //     v.push_back(*i);
    // }
    return v;
}

int removeDuplicates(vector<int> &arr, int n) {
    int p=0;
	for(int i = 0; i< n; i++){
        if(arr[p]!=arr[i]){
            arr[p+1] = arr[i];
            p++;
        }
    }
    return p+1;
}

int missingNumber(vector<int>& nums) {
        // int sum1 = (nums.size()*(nums.size()+1))/2;
        // int sum2 = 0;
        // for(int i = 0; i<nums.size(); i++){
        //     sum2+=nums[i];
        // }
        // return sum1-sum2;

        int xor1 = 0; 
        int xor2 = 0;
        for(int i = 0; i<nums.size(); i++){
            xor1^=nums[i];
            xor2 = xor2^(i+1);
        }

        return xor2^xor1;
    }

    int singleNumber(vector<int>& nums) {
        int xor1 = 0;
        for(int i = 0; i<nums.size(); i++){
            xor1^=nums[i];
        }
        return xor1;
    }

    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i<nums.size(); i++){
            if(nums[i]==1){
                count++;
                if(count>=max) max = count;
            }else{
                count = 0;
            }
        }
        return max;
    }

    int longestSubarrayWithSumK(vector<int> a, long long k) {

    int n = a.size();
    int i = 0;
    int j = 0;
    long long sum = a[0];
    int maxLen = 0;
    while(j<n){
        while(i<j && sum>k){
                sum-=a[i];
                i++;
            }
        if(sum==k){
            maxLen = max(maxLen, j-i+1); 
        } 
        j++;
        if(j<n) sum += a[j];
        
    }
    return maxLen;

    
    
}

    string read(int n, vector<int> book, int target)
{  sort(book.begin(),book.end());
   int left=0,right=n-1;
   while(left<right){
       int sum=book[left]+book[right];
       if(sum==target){
           return "YES";
       }
       else if(sum<target) left++;
       else if (sum>target)right--;
   }
   return "NO";
}

    vector<int> twoSum(vector<int> &arr, int target) {
    int n = arr.size();
    unordered_map<int, int> mpp;
    for (int i = 0; i < n; i++) {
        int num = arr[i];
        int moreNeeded = target - num;
        if (mpp.find(moreNeeded) != mpp.end()) {
            return {mpp[moreNeeded], i};
        }
        mpp[num] = i;
    }
    return { -1, -1};    
}

// void sortColors(vector<int>& nums){
//         int hash[3] = {0};
//     for (int i = 0; i < nums.size(); i++) {
//         hash[nums[i]] += 1;
//     }
//     for(int i=0;i<hash[0];i++){
//         nums[i]=0;
//         }
//     for(int i=hash[0];i<hash[0]+hash[1];i++){
//         nums[i]=1;
//         }
//     for(int i=hash[0]+hash[1];i<hash[0]+hash[1]+hash[2];i++){
//         nums[i]=2;
//         }
//     }

//Dutch National Flag Algorithm
void sortColors(vector<int> &nums){
    int low = 0, mid = 0, high = nums.size()-1;
    if(nums.size()==1) return;
    while(mid<=high){
        if(nums[mid]==0){
        swap(nums[low], nums[mid]);
        low++;
        mid++;
    }
    else if(nums[mid]==1){
        mid++;
    }
    else{
        swap(nums[mid], nums[high]);
        high--;
    }} 
}

// vector<int> countSSmaller(vector<int>& nums) {
//         int n = nums.size();
//         vector<int> res(n, 0);
//         for(int i = 0;i<n;i++){
//             for(int j = i+1; j<n; j++){
//                 if(nums[j]<nums[i]){
//                     res[i]++;
//                 }
//             }
//         }
//         return res;
    
//     }

vector<int> countSmaller(vector<int>& nums) {
        int N = nums.size();

        vector<pair<int, int> > v(N);
        for (int i = 0; i < N; i++)   
            v[i] = make_pair(nums[i], i);

        vector<int> count(N, 0);
        // sorting in descending order
        mergeSort(count, v, 0, N-1);

        return count;
        
    }

    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int, int> m;
        
        for(int i = 0; i < n; i++){
            m[nums[i]]++;
        }
        n = n/2;
        for(auto x: m){
            if(x.second > n){
                return x.first;
            }
        }
        return 0;

    }

    // int majorityElement(vector<int>& a) {
    // int ans=a[0],count=1;
    // for(int i=1;i<a.size();i++){
    //     while(i<a.size()&&count>0){
    //         if(a[i]==ans) count++;
    //         else count--;
    //         i++;
    //     }
    //     if(count==0){
    //         ans=a[i];
    //         count++;
    //     }

    // }
    // return ans;
    // }

// A utility function to find maximum of two integers 
int max(int a, int b) { 
    return (a > b) ? a : b; 
}

// A utility function to find maximum of three integers 
int max(int a, int b, int c) { 
    return max(max(a, b), c); 
} 
  
// Find the maximum possible sum in arr[] such that arr[m] 
// is part of it 
int maxCrossingSum(int arr[], int l, int m, int h) { 
    // Include elements on left of mid. 
    int sum = 0; 
    int left_sum = INT_MIN; 
    for (int i = m; i >= l; i--) { 
        sum = sum + arr[i]; 
        if (sum > left_sum) 
            left_sum = sum; 
    } 
  
    // Include elements on right of mid 
    sum = 0; 
    int right_sum = INT_MIN; 
    for (int i = m; i <= h; i++) { 
        sum = sum + arr[i]; 
        if (sum > right_sum) 
            right_sum = sum; 
    } 
  
    // Return sum of elements on left and right of mid 
    // returning only left_sum + right_sum will fail for 
    // [-2, 1] 
    return max(left_sum + right_sum - arr[m], left_sum, right_sum); 
} 
  
// Returns sum of maximum sum subarray in aa[l..h] 
int maxSubArraySumm(int arr[], int l, int h) { 
    // Invalid Range: low is greater than high 
    if (l > h) 
        return INT_MIN; 
    // Base Case: Only one element 
    if (l == h) 
        return arr[l]; 
  
    // Find middle point 
    int m = (l + h) / 2; 
  
    /* Return maximum of following three possible cases 
            a) Maximum subarray sum in left half 
            b) Maximum subarray sum in right half 
            c) Maximum subarray sum such that the subarray 
       crosses the midpoint */
    return max(maxSubArraySumm(arr, l, m - 1), 
               maxSubArraySumm(arr, m + 1, h), 
               maxCrossingSum(arr, l, m, h)); 
} 

int maxSubArraySum(vector<int> &nums){
    int l = 0; int h = nums.size()-1; int arr[nums.size()];
    for(int i=0;i<nums.size();i++){
        arr[i] = nums[i];
    }
    return maxSubArraySumm(arr, l, h);

}

    // vector<int> maxSubArray(vector<int>& nums) {
    //     int n = nums.size();
    //     int sum = 0;
    //     long long maxSum = INT_MIN;
    //     int start = 0;
    //     int end = 0;
    //     for(int i = 0; i<n; i++){
    //         sum+=nums[i];
    //         if(sum>maxSum){
    //             maxSum = sum;
    //             end = i;
    //         }
    //         if(sum<0){
    //             sum = 0;
    //             start = i+1;
    //         }
    //     }
    //     vector<int> v;
    //     for(int i = start; i<=end; i++){
    //         v.push_back(nums[i]);
    //     }
    //     return v;
    // }



// n^2 time complexity own code because *max_element is O(n) time complexity

    // int maxProfit(vector<int>& nums) {
    //     int n = nums.size();
    //     int prof = 0;
    //     for(int i=0; i<n; i++){
    //         if(nums[i]<*max_element(nums.begin()+i, nums.end())){
    //             if(*max_element(nums.begin()+i, nums.end())-nums[i]>prof){
    //                 prof = *max_element(nums.begin()+i, nums.end())-nums[i];
    //             }
    //         }
            
    //     }
    //     if(prof<0) prof = 0;
    //         return prof;
    // }

// n time complexity optimal version

int maxProfit(vector<int>& nums) {

    //use these lines to optimize the code to run extremely faster
    ios_base::sync_with_stdio(0);
        cin.tie(NULL);
        cout.tie(NULL);

    int n = nums.size();
    long long prof = 0;
    long long minPrice = INT_MAX;

    for(int i=0; i<n; i++){
        if(nums[i] < minPrice){
            minPrice = nums[i];
        } else if(nums[i] - minPrice > prof){
            prof = nums[i] - minPrice;
        }
    }

    return prof;
}

    vector<int> rearrangeArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> pos;
        vector<int> neg;  
        //separate positive and negative numbers
        for(int i =0; i<n; i++){
            if(nums[i]<0){
                neg.push_back(nums[i]);
            }else{
                pos.push_back(nums[i]);
            }
        }
        vector<int> v;
        for(int i = 0; i<n/2; i++){
            v.push_back(pos[i]);
            v.push_back(neg[i]);
        }
        return v;
    }

    void nextPermutation(vector<int>& nums) {
        ios_base::sync_with_stdio(0);
        cin.tie(NULL);
        cout.tie(NULL);

        int n = nums.size();
        vector<int> v = nums;
        int i=n-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if(i>=0){
        int j = n - 1;
        while(j > i && nums[j] <= nums[i]) {
            j--;
        }
        swap(nums[i], nums[j]);
        sort(nums.begin()+i+1, nums.end());
    }
        if(v==nums){
            swap(nums[0],nums[n-1]);
            sort(nums.begin()+i+1, nums.end());
        }
    }

    int trap(vector <int> & height) {
  int n = height.size();
  int left = 0, right = n - 1;
  int res = 0;
  int maxLeft = 0, maxRight = 0;
  while (left <= right) {
    if (height[left] <= height[right]) {
      if (height[left] >= maxLeft) {
        maxLeft = height[left];
      } else {
        res += maxLeft - height[left];
      }
      left++;
    } else {
      if (height[right] >= maxRight) {
        maxRight = height[right];
      } else {
        res += maxRight - height[right];
      }
      right--;
    }
  }
  return res;
}

int largestRectangleArea(vector < int > & heights) {
      int n = heights.size();
      stack < int > st;
      int leftsmall[n], rightsmall[n];
      for (int i = 0; i < n; i++) {
        while (!st.empty() && heights[st.top()] >= heights[i]) {
          st.pop();
        }
        if (st.empty())
          leftsmall[i] = 0;
        else
          leftsmall[i] = st.top() + 1;
        st.push(i);
      }
      // clear the stack to be re-used
      while (!st.empty())
        st.pop();

      for (int i = n - 1; i >= 0; i--) {
        while (!st.empty() && heights[st.top()] >= heights[i])
          st.pop();

        if (st.empty())
          rightsmall[i] = n - 1;
        else
          rightsmall[i] = st.top() - 1;

        st.push(i);
      }
      int maxA = 0;
      for (int i = 0; i < n; i++) {
        maxA = max(maxA, heights[i] * (rightsmall[i] - leftsmall[i] + 1));
      }
      return maxA;
    }

// int largestRectangleArea(vector < int > & histo) {
//       stack < int > st;
//       int maxA = 0;
//       int n = histo.size();
//       for (int i = 0; i <= n; i++) {
//         while (!st.empty() && (i == n || histo[st.top()] >= histo[i])) {
//           int height = histo[st.top()];
//           st.pop();
//           int width;
//           if (st.empty())
//             width = i;
//           else
//             width = i - st.top() - 1;
//           maxA = max(maxA, width * height);
//         }
//         st.push(i);
//       }
//       return maxA;
//     }

int smallestDistancePair(vector<int>& nums, int k) {
    sort(nums.begin(), nums.end());
    int n = nums.size();
    int low = 0;
    int high = nums[n-1] - nums[0];
    
    while (low < high) {
        int mid = low + (high - low) / 2;
        int count = 0;
        int left = 0;
        for (int right = 0; right < n; ++right) {
            while (nums[right] - nums[left] > mid) ++left;
            count += right - left;
        }
        if (count < k) low = mid + 1;
        else high = mid;
    }
    return low;
}

// int smallestDistancePair(vector<int> &nums, int k){

//     int n = nums.size();
//     sort(nums.begin(), nums.end());
//     map<int, int> m;
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             m[abs(nums[i]-nums[j])]++;
//         }
//     }
//     for(auto x: m){
//         if(k <= x.second){
//             return x.first;
//         }
//         k -= x.second;
//     }
//     return 0;

// }

vector<int> mergeSortedArrays(vector<int>& arr1, vector<int>& arr2) {
    vector<int> result;
    int i = 0, j = 0;

    // Merge elements from arr1 and arr2 in sorted order
    while (i < arr1.size() && j < arr2.size()) {
        if (arr1[i] <= arr2[j]) {
            result.push_back(arr1[i]);
            i++;
        } else {
            result.push_back(arr2[j]);
            j++;
        }
    }

    // If there are remaining elements in arr1, append them to the result
    while (i < arr1.size()) {
        result.push_back(arr1[i]);
        i++;
    }

    // If there are remaining elements in arr2, append them to the result
    while (j < arr2.size()) {
        result.push_back(arr2[j]);
        j++;
    }

    return result;
}

    
    double MedianOfArrays(vector<int>& array1, vector<int>& array2)
{
    vector<int> combinedArr = mergeSortedArrays(array1,array2);

    double median = 0;

    if(combinedArr.size() % 2 == 0)
    {
        median = (combinedArr[combinedArr.size()/2] + combinedArr[combinedArr.size()/2 - 1]) / 2.0;
    }
    else
    {
        median = combinedArr[combinedArr.size()/2];
    }

    return median;
}

    


int main(){
    int n;
    cin >> n;
    // int m;
    // cin >> m;
    // int arr[n];
    // for(int i = 0; i<n; i++){
    //     cin >> arr[i];
    // }
    // int k;
    // cin >> k;

    vector<int> vec(n);
    for(int i = 0; i<n; i++){
        cin >> vec[i];
    }

    // cout << smallestDistancePair(vec, k) << endl;
    cout << maxSubArraySum(vec) << endl;
    // sortColors(vec);
    // printVector(vec);
    // printVector(countSmaller(vec));
    // printVector(twoSum(vec, m));

    // cout << majorityElement(vec) << endl;
    // printVector(maxSubArray(vec));

    // cout << maxProfit(vec) << endl;
    // printVector(rearrangeArray(vec));
    // nextPermutation(vec);
    // printVector(vec);
    // vector<int> vecb(m);
    // for(int i = 0; i<m; i++){
    //     cin >> vecb[i];
    // }

    // cout << missingNumber(vec) << endl;

    // cout << singleNumber(vec) << endl;

    // cout << findMaxConsecutiveOnes(vec) << endl;

    // cout << longestSubarrayWithSumK(vec, m) << endl;


    // cout << removeDuplicates(vec, n) << endl;

    // printVector(sortedArray(vec, vecb));
    // cout << largestElement(vec, n) << endl;
    
    // vec = getSecondOrderElements(n, vec);
    // printVector(getSecondOrderElements(n, vec));
    // int count=0;
    // for(int i=0;i<n;i++)
    // count+=countSmaller(vec)[i];
    // for(int i = 0; i<n; i++){
    //     cout << arr[i] << " ";
    // }
    // cout << count;

    return 0;
}