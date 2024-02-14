#include<iostream>
#include <math.h>
using namespace std;
int main() {
	int a, b, c;
	cin >> a >> b >> c;
	if(b*b>4*a*c){
		cout << "Real and Distinct" << endl;
		int r1 = (-b+sqrt(b*b-4*a*c))/(2*a);
        int r2 = (-b-sqrt(b*b-4*a*c))/(2*a);
        cout << r1 << " " << r2 << endl;
	}
    if(b*b==4*a*c){
		cout << "Real and Equal" << endl;
		int r1 = (-b+sqrt(b*b-4*a*c))/(2*a);
        int r2 = (-b-sqrt(b*b-4*a*c))/(2*a);
        cout << r1 << " " << r2 << endl;
	}
    if(b*b<4*a*c){
		cout << "Imaginary" << endl;
	}
	return 0;
}
