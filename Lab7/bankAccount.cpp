//
//  bankAccount.cpp
//  Lab7
//
//  Created by Christina Campbell on 11/26/18.
//  Copyright © 2018 Christina Campbell. All rights reserved.
//

#include "bankAccount.h"
#include<string>


bankAccount::bankAccount(std::string n, double b) {
        name= n;
        balance=b;
    }
std::string bankAccount::getName() {
        return name;
    }
double bankAccount::getBalance() {
        return balance;
    }
double bankAccount::deposit(double a) {
        balance= balance + a;
        //return the new balance
        return balance;
    }
    //create a method that removes a designated amount of money from a specific bank account
double bankAccount::withdraw (double r) {
        balance= balance - r;
        //return the new bank balance
        return balance;
    }
void bankAccount::transfer (bankAccount* otherAccount, int r) {
        //use the previous methods
        withdraw(r);
        otherAccount->deposit(r);
    }
std::string bankAccount::toString() {
        std::string bankInfo= getName() + ": $"+ std::to_string(getBalance());
        return bankInfo;
    }

