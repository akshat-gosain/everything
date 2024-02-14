// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

#include <bits/stdc++.h>
using namespace std;
#define mod 1000000007

class Solution
{
public:
    int shipWithinDays(vector<int> &weights, int days)
    {
        int l = *max_element(weights.begin(), weights.end());
        int h = 1e9;

        while (h - l >= 1)
        {
            int mid = l + (h - l) / 2;

            int k = 1, sum = 0;
            for (int i = 0; i < weights.size(); i++)
            {
                if (sum + weights[i] > mid)
                {
                    sum = weights[i];
                    k++;
                }
                else
                {
                    sum += weights[i];
                }
            }

            if (k > days)
            {
                l = mid + 1;
            }
            else
            {
                h = mid;
            }
        }

        return l;
    }
};

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    vector<int> weights = {1, 2, 3, 1, 1};
    Solution S;
    cout << S.shipWithinDays(weights, 4);
}
