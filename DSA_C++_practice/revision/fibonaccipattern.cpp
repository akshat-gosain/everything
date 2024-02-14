#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int a = 0;
    int b = 1;
    for(int i = 0; i <= n; i++){
        for(int j = 0; j <= i; j++){
            cout << a << " ";
            a = a + b;
        }
        cout << endl;
    }
    return 0;
}