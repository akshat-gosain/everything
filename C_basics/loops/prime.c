#include <stdio.h>
#include <stdlib.h>

int main(){
    int n;
    int a=1;
    printf("enter number:");
    scanf("%d", &n);
    for(int i=2; i<n; i++){
        if(n%i==0){
            a=0;
            i=n;
        }        
    }
    if(a==0){
            printf("non-prime\n");
        }else{
            printf("prime\n");
        }
}