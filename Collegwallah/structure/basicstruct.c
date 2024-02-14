#include <stdio.h>
#include <string.h>

int main(){
    struct book{
        char name[50];
        int noOfpages;
        float price;
    }a,b,c;

    a.noOfpages = 100;
    a.price = 411.5;
    strcpy(a.name, "Secret seven");\
    
    b.noOfpages = 200;
    b.price = 434.43;
    strcpy(a.name, "Famous five");

    c.noOfpages = 250;
    c.price = 302.54;
    strcpy(a.name, "Wimpy kid");

}

