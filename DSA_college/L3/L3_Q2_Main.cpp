#include <bits/stdc++.h>
#include "DSA_Vector.cpp"
#include "L3_Q2_2022A7PS0154G.cpp"

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t > 0)
    {
        t--;
        DSA_Vector v;
        int target;
        cin >> target;
        solve(v,target); //Find the index of the largest and the smallest element
    }
    return 0;
}
