#include <stdio.h>

int min(int a, int b)
{
    if(a<b) return a;
    else return b;
}

int hcf(int a, int b)
{   
    int hcf;
    for(int i=min(a,b); i>=1; i--){
        if(a%i==0 && b%i==0){
            hcf = i;
            break;
        }
    }
   
    // int hcf=1;
    // for(int i=1; i<=min(a,b); i++){
    //     if(a%i==0 && b%i==0){
    //         hcf = i;
    //     }
    // }
    return hcf;
}

int main(){
    int a;
    int b;
    scanf("%d %d", &a,&b);
    int gcd = hcf(a,b);
    printf("%d\n", gcd);
}