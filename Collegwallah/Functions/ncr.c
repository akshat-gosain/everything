#include <stdio.h>
#include <math.h>

int factorial(int n){
    int m=1;
    for(int i=2; i<=n; i++)
    {
        m=m*i;
    }
    return m;
}

int combination(int n, int r){
    int nfact = factorial(n);
    int rfact = factorial(r);
    int nrfact = factorial((n-r));
    int c = nfact/(rfact*nrfact);
    return c;
}
int main(){
    int n;
    int r;
    printf("Enter value of n: ");
    scanf("%d", &n);
    printf("Enter value of r: ");
    scanf("%d", &r);
    printf("\nFactorial of %d = %d\n", n, factorial(n));
    printf("nCr of n=%d and r=%d is %d\n", n, r, combination(n,r));
}