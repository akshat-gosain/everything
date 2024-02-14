#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

int* ptr = (int*)malloc(100*sizeof(int));
float* ptr1 = (float*)calloc(25, sizeof(float));

return 0;
}