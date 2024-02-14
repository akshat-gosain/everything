#include <bits/stdc++.h>
using namespace std;

//Print 1 to n without loop

// void recursiveFunction(int a, vector<int> &ans, int n){
//     ans.push_back(a);
//     if(a == n) return;
//     recursiveFunction(a+1, ans, n);
// }


// vector<int> printNos(int x){
//     vector<int> ans;
//     recursiveFunction(1,ans, x);

//     return ans;
// }

// void printNtimes(int n){
//     if(n == 0) return;
//         cout << "Coding Ninjas ";
//         printNtimes(n-1);
    
// }

// long long sumFirstN(int n){
//     if(n == 0) return 0;
//     return n + sumFirstN(n-1);
//     // return ((n)*(n+1))/2;
// }

long long factorial(long long x){
    if(x==0) return 1;
    return x*factorial(x-1);
}

void recursivefunction(long long a, vector<long long> &ans, long long n){
    
    if(factorial(a)>n) return;
    ans.push_back(factorial(a));
    recursivefunction(a+1, ans, n);
}

vector<long long> factorialNumbers(long long n) {
    // Write Your Code Here
    vector<long long> ans;
    recursivefunction(1, ans, n);
    return ans;
}

// void recursivefunction(long long a, long long fact, vector<long long> &ans, long long n){
//     if(fact > n) return;
//     ans.push_back(fact);
//     recursivefunction(a+1, (a+1)*fact, ans, n);
// }

// vector<long long> factorialNumbers(long long n) {
//     vector<long long> ans;
//     recursivefunction(1, 1, ans, n);
//     return ans;
// }

void helper(int index, vector<int> &nums, vector<int> &result){
    if(index == nums.size()) return;
    helper(index+1, nums, result);
    result.push_back(nums[index]);
}

vector<int> reverseArray(int n, vector<int> &nums) {
    vector<int> result;
    helper(0, nums, result);
    return result;
}

int main(){

    vector<int> nums = {1, 2, 3, 4, 5};
    int n = 5;
    // int n;
    // cin >> n;
    // printNtimes(n);

    // vector<int> result = printNos(n);
    // vector<long long> result = factorialNumbers(n);
    vector<int> result = reverseArray(n, nums);
    for(int i = 0; i < result.size(); i++){
        cout << result[i];
    }
    // cout << endl;

    // cout << sumFirstN(n) << endl; 

    return 0;
}


