#include <bits/stdc++.h>
using namespace std;

void printVector(const std::vector<int> &arr){
    for (int num : arr)
        cout << num << " ";
        cout << endl;
}

int binarysearch(vector<int> &nums, int low, int high, int target){
    if(low>high){
        return -1;
    }
    int mid = low+(high-low)/2;
    if(nums[mid]==target){
        return mid;
    }else if(nums[mid]<target){
        return binarysearch(nums, mid+1, high, target);
    }else{
        return binarysearch(nums, low, mid-1, target);
    }
    }

int binary_search(vector<int> &nums, int target){
    int low = 0;
    int high = nums.size()-1;
    return binarysearch(nums, low, high, target);
}

int binarysearchleft(vector<int> &nums, int low, int high, int target){
    if(low>high){
        return -1;
    }
    int mid = low+(high-low)/2;
    if(nums[mid]==target){
        return mid;
    }else if(nums[mid]<target){
        return binarysearchleft(nums, mid+1, high, target);
    }else{
        return binarysearchleft(nums, low, mid-1, target);
    }
    }

int binarsearchright(vector<int> &nums, int low, int high, int target){
    if(low>high){
        return -1;
    }
    int mid = low+(high-low)/2;
    if(nums[mid]==target){
        return mid;
    }else if(nums[mid]<=target){
        return binarsearchright(nums, mid+1, high, target);
    }else{
        return binarsearchright(nums, low, mid-1, target);
    }
    }

// vector<int> searchRange(vector<int> &nums, int target) {
//         int low = 0;
//         int high = nums.size()-1;
//         int left = binarysearchleft(nums, low, high, target);
//         int right = binarsearchright(nums, low, high, target);
//         if(left<=right){
//             return {left, right};
//         }else{
//             return {-1, -1};
//         }
//     }

int lowerBound(vector<int>& arr, int target){
        int n = arr.size();
        int low=0;
        int high=n-1;
        int ans = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            //maybe an answer
            if(arr[mid]>=target){
                ans = mid;
                //look for more small index on the left
                high = mid - 1;
            }
            else{
                low = mid + 1; //look for on right
            }
        }
        return ans;
    }

    int upperBound(vector<int>& arr, int target){
    int n = arr.size();
    int low=0;
    int high=n-1;
    int ans = -1; // Initialize with -1 for the case when target is not found
    while(low<=high){
        int mid = low + (high-low)/2;
        if(arr[mid]==target){
            ans = mid;
            low = mid + 1; //look for more big index on the right
        }
        else if(arr[mid]>target){
            high = mid - 1; //look for on left
        }
        else{
            low = mid + 1; //look for on right
        }
    }
    return ans;
}


    vector<int> searchRange(vector<int>& nums, int target) {
        return{lowerBound(nums,target),upperBound(nums,target)};
    }

    int search(vector<int>& nums, int target) {
        // Initialize pointers low and high representing the search range.
        int low = 0, high = nums.size() - 1;
        
        // Use a while loop to perform binary search.
        while (low <= high) {
            // Calculate the middle index mid.
            int mid = (low + high) / 2;
            
            // If the element at mid is equal to the target, return mid.
            if (nums[mid] == target) {
                return mid;
            } 
            // If the element at mid is greater than the target, update high to mid - 1.
            else if (nums[mid] > target) {
                high = mid - 1;
            } 
            // If the element at mid is less than the target, update low to mid + 1.
            else {
                low = mid + 1;
            }
        }
        
        // If the while loop exits, return -1, indicating that the target is not present in the array.
        return -1;
    }

    bool possible(vector<int>&weights,int mid,int days){
    long long int sum=0;
    int count=1;
    for(int i=0;i<weights.size();i++){
        sum+=weights[i];
        if(sum>mid){
        sum=weights[i];
        count++;}

    }
    if(count<=days)
    return true;
    return false;
}
    int shipWithinDays(vector<int>& weights, int days) {
        int low=*max_element(weights.begin(),weights.end());
        int high=accumulate(weights.begin(),weights.end(),0);
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
return ans;
        
    }

// function to check if it is possible to ship all the items within the given number of days using a given weight capacity
    // bool isPossible(int cp, vector<int>& weights, int days)
    // {
    //     int d = 1;
    //     int cw = 0;
    //     // iterate through the weights and check if it is possible to ship all the items
    //     for (auto x : weights) {
    //         if (x + cw <= cp) {
    //             // if the current weight can be added to the current capacity, add it
    //             cw += x;
    //         } else {
    //             // if not, increment the number of days required for shipping and start a new shipment
    //             d++;
    //             cw = x;
    //             if (x > cp) {
    //                 // if the current weight is greater than the current capacity, it is impossible to ship all the items
    //                 return false;
    //             }
    //         }
    //     }
    //     // check if it is possible to ship all the items within the given number of days
    //     return d <= days;
    // }
    
    // // function to find the minimum weight capacity required to ship all the items within the given number of days
    // int shipWithinDays(vector<int>& weights, int days)
    // {
    //     // initialize the search range for the weight capacity
    //     int s = 1;
    //     int e = 1E9;
    //     int ans = -1;
        
    //     // perform binary search on the weight capacity range
    //     while (s <= e) {
    //         // set the mid-point of the range as the current weight capacity
    //         int mid = (s + e) / 2;
            
    //         // check if it is possible to ship all the items within the given number of days using the current weight capacity
    //         bool ok = isPossible(mid, weights, days);
            
    //         // if it is possible to ship all the items within the given number of days using the current weight capacity,
    //         // set the current weight capacity as the new answer and reduce the upper bound of the weight capacity range
    //         if (ok) {
    //             ans = mid;
    //             e = mid - 1;
    //         } else {
    //             // if it is not possible to ship all the items within the given number of days using the current weight capacity,
    //             // increase the lower bound of the weight capacity range
    //             s = mid + 1;
    //         }
    //     }
        
    //     // return the minimum weight capacity required to ship all the items within the given number of days
    //     return ans;
    // }

    int findDays(vector<int> &weights, int cap) {
    int days = 1; //First day.
    int load = 0;
    int n = weights.size(); //size of array.
    for (int i = 0; i < n; i++) {
        if (load + weights[i] > cap) {
            days += 1; //move to next day
            load = weights[i]; //load the weight.
        }
        else {
            //load the weight on the same day.
            load += weights[i];
        }
    }
    return days;
}

int leastWeightCapacity(vector<int> &weights, int d) {
    //Find the maximum and the summation:
    int low = *max_element(weights.begin(), weights.end());
    int high = accumulate(weights.begin(), weights.end(), 0);
    while (low <= high) {
        int mid = (low + high) / 2;
        int numberOfDays = findDays(weights, mid);
        if (numberOfDays <= d) {
            //eliminate right half
            high = mid - 1;
        }
        else {
            //eliminate left half
            low = mid + 1;
        }
    }
    return low;
}

    int searchInsert(vector<int>& nums, int target) {
        int low = 0, high = nums.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    pair<int, int> getFloorAndCeil(vector<int> &nums, int n, int target) {
        int low = 0, high = n - 1;
        int mid = 0;
        int first = -1;
        int last = nums[0];
        while (low <= high) {
            mid = (low + high) / 2;
            
            if (nums[mid] == target) {
               first = nums[mid];
               last = nums[mid];
               return {first,last};
            } 
            else if (nums[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        first = nums[low-1];
        last = nums[low];
        if(low==0) first = -1;
        if(low == n) last = -1;
        return {first,last};
    }

    int searchRotated(vector<int>& arr, int n, int k) {
    int low = 0, high = n - 1;
    while (low <= high) {
        int mid = (low + high) / 2;

        //if mid points the target
        if (arr[mid] == k) return mid;

        //if left part is sorted:
        if (arr[low] <= arr[mid]) {
            if (arr[low] <= k && k <= arr[mid]) {
                //element exists:
                high = mid - 1;
            }
            else {
                //element does not exist:
                low = mid + 1; 
            }
        }
        else { //if right part is sorted:
            if (arr[mid] <= k && k <= arr[high]) {
                //element exists:
                low = mid + 1;
            }
            else {
                //element does not exist:
                high = mid - 1;
            }
        }
    }
    return -1;
}

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

int main(){
    int n;
    cin >> n;
    int target;
    cin >> target;

    vector<int> vec(n);
    for(int i = 0; i<n; i++){
        cin >> vec[i];
    }
    // cout << searchInsert(vec, target);
    // pair<int,int> p = getFloorAndCeil(vec,n,target);
    // cout << p.first << " " << p.second;
    // cout << binary_search(vec, target) << endl;





    return 0;
}