#include <stdio.h>

int main(){
    FILE *ptr = fopen("akshat.txt", "r");
    char str[100];
    if(fgets(str,100,ptr)!=NULL)
    printf("%s", str);
}