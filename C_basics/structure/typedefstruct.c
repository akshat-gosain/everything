#include <stdio.h>
#include <string.h>


typedef struct book{
        char name[50];
        int noOfpages;
        float price;
    }buk;

int main(){
    
    buk a;
    buk b;
    buk c;

    a.noOfpages = 100;
    a.price = 411.5;
    strcpy(a.name, "Secret seven");\
    
    b.noOfpages = 200;
    b.price = 434.43;
    strcpy(b.name, "Famous five");

    c.noOfpages = 250;
    c.price = 302.54;
    strcpy(c.name, "Wimpy kid");

    printf("");

    return 0;

}

