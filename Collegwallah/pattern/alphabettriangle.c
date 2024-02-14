#include <stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    for(char i=1; i<=n; i++)
    {
        for(char j=1; j<=i; j++)
        {
            char ch = (char)(j+64);
            printf("%c", ch);
        }
        printf("\n");
    }
}