#include <stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if((i<((n+1)/2))&&((j<=(((n+1)/2)-i))||(j>(n-(((n+1)/2)-i))))
            ||(i>((n+1)/2))&&((j<=(i-((n+1)/2)))||(j>(n-(i-((n+1)/2))))))
              
            printf("-");
            else
            printf("*");
        }
        printf("\n");
    }
    return 0;
}