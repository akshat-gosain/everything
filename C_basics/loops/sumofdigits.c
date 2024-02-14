#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main(){
    int n;
    int sum =0;
    printf("enter number: ");
    scanf("%d", &n);
    while(n!=0)
    {
        sum = sum + n%10;
        n=n/10;
    }
    printf("sum of digits: %d\n\n", sum);
}