// https://leetcode.com/problems/split-array-largest-sum/

class Solution {
public:
    bool is_possible(vector<int>& nums, int k, int mid){
        int n=nums.size();
        int count=1;
        int curr=0;
        for(int i=0;i<n;i++){
            if(curr+nums[i]>mid){
                count++;
                curr=0;
            }
            curr+=nums[i];
        }
        return count<=k;
    }
    int splitArray(vector<int>& nums, int k) {
        int n=nums.size();
        int lb=0,ub=0;
        for(int i=0;i<n;i++){
            lb=max(lb,nums[i]);
            ub+=nums[i];
        }
        while(ub>lb){
            int mid=(ub+lb)/2;
            bool b=is_possible(nums,k,mid);
            if(b){
                ub=mid;
            }
            else{
                lb=mid+1;
            }
        }
        return ub;
    }
};

