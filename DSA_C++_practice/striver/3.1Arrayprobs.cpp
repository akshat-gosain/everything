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

int getLongestSubarray(vector<int>& a, int k) {
    int n = a.size(); // size of the array.

    map<int, int> preSumMap;
    int sum = 0;
    int maxLen = 0;
    for (int i = 0; i < n; i++) {
        //calculate the prefix sum till index i:
        sum += a[i];

        // if the sum = k, update the maxLen:
        if (sum == k) {
            maxLen = max(maxLen, i + 1);
        }

        // calculate the sum of remaining part i.e. x-k:
        int rem = sum - k;

        //Calculate the length and update maxLen:
        if (preSumMap.find(rem) != preSumMap.end()) {
            int len = i - preSumMap[rem];
            maxLen = max(maxLen, len);
        }

        //Finally, update the map checking the conditions:
        if (preSumMap.find(sum) == preSumMap.end()) {
            preSumMap[sum] = i;
        }
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

// string twoSum(int n, vector<int> &arr, int target) {
//     sort(arr.begin(), arr.end());
//     int left = 0, right = n - 1;
//     while (left < right) {
//         int sum = arr[left] + arr[right];
//         if (sum == target) {
//             return "YES";
//         }
//         else if (sum < target) left++;
//         else right--;
//     }
//     return "NO";
// }

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

    struct SubarrayInfo {
    int sum;
    int maxSum;
    int leftMaxSum;
    int rightMaxSum;
};

    SubarrayInfo maxSubarraySum(const vector<int>& nums, int low, int high) {
    SubarrayInfo result;
    if (low == high) {  // Base case: single element.
        result.sum = nums[low];
        result.maxSum = nums[low];
        result.leftMaxSum = nums[low];
        result.rightMaxSum = nums[low];
    } else {
        int mid = low + (high - low) / 2;
        SubarrayInfo leftSubarray = maxSubarraySum(nums, low, mid);
        SubarrayInfo rightSubarray = maxSubarraySum(nums, mid + 1, high);
        result.sum = leftSubarray.sum + rightSubarray.sum;
        result.leftMaxSum = max(leftSubarray.leftMaxSum, leftSubarray.sum + rightSubarray.leftMaxSum);
        result.rightMaxSum = max(rightSubarray.rightMaxSum, rightSubarray.sum + leftSubarray.rightMaxSum);
        result.maxSum = max({leftSubarray.maxSum, rightSubarray.maxSum, leftSubarray.rightMaxSum + rightSubarray.leftMaxSum});
    }
    return result;
}
    int maxSubArray(vector<int>& nums) {
        SubarrayInfo result = maxSubarraySum(nums,0,nums.size()-1);
        return result.maxSum;
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

// Function to merge two subarrays of arr[].
// First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
long long merge(long long* arr, long long lb, long long mid, long long ub) {
  long long dup[ub - lb + 1];
  long long res = 0;
  for (long long i = 0; i < (ub - lb + 1); i++) {
    dup[i] = arr[lb + i];
  }

  long long p1 = lb, p2 = mid + 1;
  long long count = 0;
  while (p1 <= mid && p2 <= ub) {
    if (dup[p1 - lb] <= dup[p2 - lb]) {
      arr[lb + count] = dup[p1 - lb];
      p1++;
    } else {
      arr[lb + count] = dup[p2 - lb];
      res += (mid - p1 + 1);
      p2++;
    }
    count++;
  }

  while (p1 <= mid) {
    arr[lb + count] = dup[p1 - lb];
    count++;
    p1++;
  }

  while (p2 <= ub) {
    arr[lb + count] = dup[p2 - lb];
    count++;
    p2++;
  }

  return res;
}

// Function to sort an array arr[] of size n using
// merge sort
long long merge_sort(long long* arr, long long lb, long long ub) {
  long long res = 0;
  if (ub > lb) {
    long long mid = lb + ((ub - lb) / 2);
    res += merge_sort(arr, lb, mid);
    res += merge_sort(arr, mid + 1, ub);
    res += merge(arr, lb, mid, ub);
  }
  return res;
}

// Function to count inversions in an array arr[] of size n
long long int inversionCount(long long arr[], long long N) {
  // Call merge_sort and return the inversion count
  return merge_sort(arr, 0, N - 1);
}

int maxArea(vector<int>& height) {
        int n=height.size();
        int l=0;
        int r=n-1;
        int maxa = 0;
        while(l<r){
            if(min(height[l],height[r])*(r-l)>maxa) maxa = min(height[l],height[r])*(r-l);
            if(height[l]<height[r]){l++;}else{r--;}
        }
        return maxa;
    }

vector<int> superiorElements(vector<int>&arr) {
        int n = arr.size();
        vector<int> ans;
        int max = arr[n - 1];
        ans.push_back(arr[n-1]);

        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
            ans.push_back(arr[i]);
            max = arr[i];
        }
        return ans;
}

int lengthOfLongestSubstring(string s) {
        vector < int > mpp(256, -1);

      int left = 0, right = 0;
      int n = s.size();
      int len = 0;
      while (right < n) {
        if (mpp[s[right]] != -1)
          left = max(mpp[s[right]] + 1, left);

        mpp[s[right]] = right;

        len = max(len, right - left + 1);
        right++;
      }
      return len;
    
    }

    int findAllSubarraysWithGivenSum(vector < int > & arr, int k) {
    int n = arr.size(); // size of the given array.
    map mpp;
    int preSum = 0, cnt = 0;

    mpp[0] = 1; // Setting 0 in the map.
    for (int i = 0; i < n; i++) {
        // add current element to prefix Sum:
        preSum += arr[i];

        // Calculate x-k:
        int remove = preSum - k;

        // Add the number of subarrays to be removed:
        cnt += mpp[remove];

        // Update the count of prefix sum
        // in the map.
        mpp[preSum] += 1;
    }
    return cnt;
}
    
    int maxProductSubArray(vector<int>& nums) {
    int prod1 = nums[0],prod2 = nums[0],result = nums[0];
    
    for(int i=1;i<nums.size();i++) {
        int temp = max({nums[i],prod1*nums[i],prod2*nums[i]});
        prod2 = min({nums[i],prod1*nums[i],prod2*nums[i]});
        prod1 = temp;
        
        result = max(result,prod1);
    }
    
    return result;
}

vector<vector<int>> triplet(int n, vector<int> &arr) {
    vector<vector<int>> ans;
    sort(arr.begin(), arr.end());
    for (int i = 0; i < n; i++) {
        //remove duplicates:
        if (i != 0 && arr[i] == arr[i - 1]) continue;

        //moving 2 pointers:
        int j = i + 1;
        int k = n - 1;
        while (j < k) {
            int sum = arr[i] + arr[j] + arr[k];
            if (sum < 0) {
                j++;
            }
            else if (sum > 0) {
                k--;
            }
            else {
                vector<int> temp = {arr[i], arr[j], arr[k]};
                ans.push_back(temp);
                j++;
                k--;
                //skip the duplicates:
                while (j < k && arr[j] == arr[j - 1]) j++;
                while (j < k && arr[k] == arr[k + 1]) k--;
            }
        }
    }
    return ans;
}

int longestSuccessiveElements(vector<int>&a) {
    int n = a.size();
    if (n == 0) return 0;

    int longest = 1;
    unordered_set<int> st;
    //put all the array elements into set:
    for (int i = 0; i < n; i++) {
        st.insert(a[i]);
    }

    //Find the longest sequence:
    for (auto it : st) {
        //if 'it' is a starting number:
        if (st.find(it - 1) == st.end()) {
            //find consecutive numbers:
            int cnt = 1;
            int x = it;
            while (st.find(x + 1) != st.end()) {
                x = x + 1;
                cnt = cnt + 1;
            }
            longest = max(longest, cnt);
        }
    }
    return longest;

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
    // cout << maxSubArraySum(vec) << endl;
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