//
//  main.c
//  Lab6.2
//
//  Created by Christina Campbell on 11/5/18.
//  Copyright © 2018 Christina Campbell. All rights reserved.
//

#include <stdio.h>

int ask_in_range(int min, int max){
    int testInteger;
    printf("Please enter a number: ");
    scanf("%d",&testInteger);
    while(testInteger < min || testInteger > max){
        printf("Your number is outside of [-100, 100] range. Please enter a number: ");
        scanf("%d",&testInteger);
    }
    return testInteger;
}

int guessinggame(int num, int rangemin, int rangemax){
    num;
    int guess;
    int guessCounter = 0;
    printf("Hello and welcome to the game.\n");
    printf("You need to guess a number between -100 and 100.\n");
    
    guess = ask_in_range(rangemin,rangemax);
    while(guess!=num) {
    if(guess>num){
        printf("Too high!\n");
        guessCounter++;
        guess = ask_in_range(rangemin,rangemax);
    }
    
    if(guess<num){
        printf("Too low!\n");
        guessCounter++;
        guess = ask_in_range(rangemin,rangemax);
    }
    }
    
    if(guess==num){
        printf("Good job! You took %d guesses\n", guessCounter);
    }
    
    return num;
}

int main(void) {
    int min=-100;
    int max=100;
    guessinggame(47,min,max);
}
