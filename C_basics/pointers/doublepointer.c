#include <stdio.h>
#include <stdlib.h>

int main(){
    int a=25;
    int* x=&a;  //int*  -> int  ka address store krta
    int** y=&x; //int** -> int* ka address store krta

    printf("%p\n", x);
    printf("%p\n", &x);
    printf("%p\n", y);
    printf("%d\n", *x);
    printf("%d\n", **y);
}