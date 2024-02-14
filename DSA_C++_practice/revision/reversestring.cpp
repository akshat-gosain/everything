#include <bits/stdc++.h>

using namespace std;

/*int main(){
    string s;
    getline(cin, s);
    int n = s.length();
    for(int i = 0; i < n/2; i++){
        swap(s[i], s[n-i-1]);
    }
    cout << s << endl;
    return 0;
}*/

int main(){
    string str;
    cin >> str;
    string string_rev;

    for(int i = str.length()-1; i >= 0; i--){
        string_rev.push_back(str[i]);
    }
    cout << string_rev << endl;
}
