#include <stdio.h>
#include <string.h>

int main(){
    char str[40];
    printf("Enter a string: ");

    // scanf("%s", str); only first word will be taken
    scanf("%[^\n]s", str); // or gets(str);

    printf("%s\n", str);
    puts(str);

    return 0;
}