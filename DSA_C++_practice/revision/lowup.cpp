#include<iostream>
#include <math.h>
using namespace std;
int main() {
	char a;
	cin >> a;
	if(a<='z' && a>='a'){
        cout << "lowercase" << endl;
    }else if(a<='Z' && a>='A'){
        cout << "UPPERCASE" << endl;
        
    }else{
        cout << "Invalid" << endl;
    }
	return 0;
}