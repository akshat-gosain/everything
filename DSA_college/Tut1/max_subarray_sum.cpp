// https://leetcode.com/problems/maximum-subarray/

class Solution {
public:

    struct ret {
        int max_prefix;
        int max_suffix;
        int full_sum;
        int max_sum;
    };

    ret solve(int start, int end, vector<int>& nums)        // start and end inclusive
    {
        if(start == end)
        {
            ret base = {nums[start], nums[start], nums[start], nums[start]};
            return base;
        }

        int mid = (start + end)/2;
        ret left = solve(start, mid, nums);
        ret right = solve(mid+1, end, nums);

        ret merged;
        merged.max_prefix = max(left.max_prefix, left.full_sum + right.max_prefix);
        merged.max_suffix = max(right.max_suffix, right.full_sum + left.max_suffix);
        merged.full_sum = left.full_sum + right.full_sum;
        merged.max_sum = max({left.max_sum, right.max_sum, left.max_suffix + right.max_prefix});

        return merged;
    }

    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        ret ans = solve(0, n-1, nums);

        return ans.max_sum;
    }
};