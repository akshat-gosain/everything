#include<bits/stdc++.h>
using namespace std;


//Check Palindrome
    // bool isPalindrome(long x){
    //     if(x<0) return false;
    //     string s = to_string(x);
    //     int n = s.length();
    //     for(int i = 0; i < n/2; i++){
    //         if(s[i] != s[n-i-1]) return false;
    //     }
    //     return true;
    // }

//Reverse Bits
// long reverseBits(long n){
//     long rev = 0;
//     for(int i = 0; i<32;i++){
//         if(n%2 != 0){
//             rev+=pow(2, 31-i);
//         }
//         n = n/2;
//     }
//     return rev;
// }

//Reverse integer
    // int reverse(int x){
    //     int rev = 0;
    //     while(x != 0){
    //         if(rev > INT_MAX/10 || rev < INT_MIN/10) return 0;
    //         rev = 10*rev + x%10;
    //         x = x/10;
    //     }
    //     return rev;
    // }

//Check if a number is a perfect square
    bool isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;
        int low = 1;
        int high = num;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(num % mid == 0 && mid == num / mid) return true;
            else if(mid < num / mid) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

int main(){

// Number of digits
    // int n;
    // cin >> n;

    // int a = 0;
    // for(int i = 0; i < n; i++){
    //     if(n/10 > 0){
    //         n = n/10;
    //         a++;
    //     }else{
    //         i=n;
    //     }
    // }
    // cout << a << endl;

    // string x = to_string(n);
    // cout << x.length() << endl;

// Reverse bits
    // int n;
    // cin >> n;
    // for(int i = 0; i < n; i++){
    //     long x;
    //     cin >> x;
    //     cout << reverseBits(x) << endl;
    // }
// Reverse integer
    // long n;
    // cin >> n;
    // cout << reverse(n) << endl;

// Check Palindrome
    int n;
    cin >> n;
    // cout << isPalindrome(n) << endl;
    cout << isPerfectSquare(n) << endl;

    return 0;
}

