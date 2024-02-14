#include <stdio.h>
#include <string.h>
#include <stdbool.h>

typedef struct pokemon{
    int hp;
    int speed;
    int attack;
    char tier;
    char name[15];
} pokemon;

void change(pokemon* p){
    (*p).hp=80;
    (*p).speed=90;
    (*p).attack = 110;
    (*p).tier = 'S';
    strcpy((*p).name, "Raichu");
}

int main(){
    pokemon pikachu;
    pikachu.hp=60;
    pikachu.speed=80;
    pikachu.attack = 100;
    pikachu.tier = 'A';
    strcpy(pikachu.name, "Pikachu");

    pokemon* x = &pikachu; //checking that it 
                           //works by assigning pointer
    
    (*x).hp=70;

    printf("\n%s\n", pikachu.name);
    printf("%d\n", pikachu.hp);
    printf("%d\n", pikachu.speed);
    printf("%d\n", pikachu.attack);
    printf("%c\n", pikachu.tier);
    

    change(&pikachu);

    
    printf("\n%s\n", pikachu.name);
    printf("%d\n", pikachu.hp);
    printf("%d\n", pikachu.speed);
    printf("%d\n", pikachu.attack);
    printf("%c\n", pikachu.tier);
    

}
