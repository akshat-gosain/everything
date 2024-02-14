#include <stdio.h>
#include <string.h>

int main(){
    char str[40];
    scanf("%[^\n]s", str);
    // gets(str);

    int size = 0;
    int i=0;

    while(str[i]!='\0'){
        size++;
        i++;
    }
    printf("%d\n", size);

    return 0;
}