#include <stdio.h>
#include <string.h>

typedef struct pokemon{
    int attack;
    int speed;
    int hp;
    char tier;
    char name[15];
} pokemon;

int main(){

    pokemon arr[3];
    arr[0].name;
    strcpy(arr[0].name,"Pikachu");
    arr[0].attack = 50;
    arr[0].speed = 30;
    arr[0].hp = 100;
    arr[0].tier = 'A';

    arr[1].name;
    strcpy(arr[1].name,"Charizard");
    arr[1].attack = 40;
    arr[1].speed = 50;
    arr[1].hp =90;
    arr[1].tier = 'B';

    arr[2].name;
    strcpy(arr[2].name,"Squirtle");
    arr[2].attack = 70;
    arr[2].speed = 60;
    arr[2].hp = 80;
    arr[2].tier = 'C';

    for(int i=0; i<3; i++){
        printf("\nName: %s\n", arr[i].name);
        printf("Attack: %d\n", arr[i].attack);
        printf("Speed: %d\n", arr[i].speed);
        printf("HP: %d\n", arr[i].hp);
        printf("Tier: %c\n", arr[i].tier);
    }
}