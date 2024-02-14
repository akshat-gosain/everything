#include <bits/stdc++.h>
using namespace std;

vector<int> countFrequency(int n, int x, vector<int> &nums){
    // Write your code here.
    vector<int> hash(n,0);

    for(int i=0;i<n;i++){
        hash[nums[i]-1]++;
    }
    //fetching
    return hash;
}

int main(){
    int n;
    int b;
    cin >> n;
    cin >> b;
    // int arr[n];
    // for(int i = 0; i<n; i++){
    //     cin >> arr[i];
    // }

    // //precompute
    // int hash[n] = {0};
    // for(int i = 0; i<n; i++){
    //     hash[arr[i]]++;
    // }
vector<int> numbers;
int num;
for (int i = 0; i < n; ++i) {
    cin >> num;
    numbers.push_back(num);
}

    vector<int> result = countFrequency(n, b, numbers);
    for(int i = 0; i < result.size(); i++){
        cout << result[i];
    }
    // //fetching
    // for(int i = 0; i<n; i++){
    //     cout << hash[i] << endl;}

    // int q;
    // cin >> q;
    // while(q--){
    //     int number;
    //     cin >> number;
    //     //fetching
    //     cout << hash[number] << endl;
    // }
    return 0;
}