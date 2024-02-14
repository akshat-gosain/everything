#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int b = 1;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            cout << b << " ";
            b++;
        }
        cout << endl;
    }
    return 0;
}