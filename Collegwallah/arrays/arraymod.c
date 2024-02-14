#include <stdio.h>
#include <string.h>
#include <ctype.h>


void arrodd(int x[], int n)
{
    for(int i=0; i<n; i++){
        if(i%2==1){
            x[i]*=2;
        }
    }
}
void arreven(int x[], int n)
{
    for(int i=0; i<n; i++){
        if(i%2==0){
            x[i]+=10;
        }
    }
}

int main(){
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter array: ");
    for(int i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }
    for(int j=0; j<n; j++)
    {
        printf("%d ", arr[j]);
    }
    arrodd(arr, n);
    printf("\n");
    for(int j=0; j<n; j++)
    {
        printf("%d ", arr[j]);
    }
    arreven(arr, n);
    printf("\n");
    for(int j=0; j<n; j++)
    {
        printf("%d ", arr[j]);
    }
    printf("\n");
    for(int j=0; j<n; j++)
    {
        printf("%d ", arr[j]);
    }
}