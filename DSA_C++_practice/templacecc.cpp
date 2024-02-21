#include <bits/stdc++.h>
using namespace std;

const int MAXN = 1e6+5;
int dp[MAXN];

void precompute() {
    for(int i=1; i<MAXN; i++) {
        int temp = i, count = 0;
        while(temp > 0) {
            if(temp % 10 != 0) count++;
            temp /= 10;
        }
        if(count == 1) dp[i] = dp[i-1] + 1;
        else dp[i] = dp[i-1];
    }
}

int main(){
    precompute();
    int t;
    cin >> t;
    while(t--) {
        int n;
        cin >> n;
        cout << dp[n] << endl;
    }
    return 0;
}





void solve(vector<int> arr, int n){
 
}



// int main() {
//     ios_base::sync_with_stdio(false);
//     cin.tie(NULL);
//     int s;
//     cin>>s; 
//     while(s > 0)
//     {
//         s--;
//         int n;
//         cin>>n;
//         std::vector<int> array(n+1);
//         for (int i = 0; i < n; i++) {
//         std::cin >> array[i];
//         }
//         solve(array,n);
//     }
// }

