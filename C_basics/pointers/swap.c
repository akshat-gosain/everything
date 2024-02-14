#include <stdio.h>
#include <stdlib.h>

void swap(int* x, int* y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

int main(){
    int a;
    scanf("%d", &a);
    int b;
    scanf("%d", &b);
    swap(&a,&b);
    printf("a: %d, b: %d", a, b);
}