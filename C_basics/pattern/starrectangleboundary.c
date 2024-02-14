#include <stdio.h>
int main(){
    int n;
    int m;
    printf("enter no of rows: ");
    scanf("%d", &n);
    printf("enter number of columns: ");
    scanf("%d", &m);
    for(int i=1; i<=n; i++)
    {   
        for(int j=1; j<=m; j++)
        {
            if(i==1||i==n){printf("*");}else{
            if(j==1||j==m){printf("*");}else{printf(" ");}}
        }

        printf("\n");
    }
}