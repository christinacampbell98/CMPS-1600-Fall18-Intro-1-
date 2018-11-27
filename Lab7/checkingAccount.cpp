//
//  checkingAccount.cpp
//  Lab7
//
//  Created by Christina Campbell on 11/26/18.
//  Copyright © 2018 Christina Campbell. All rights reserved.
//

#include "checkingAccount.h"
#include <string>

checkingAccount:: checkingAccount(std::string n, double b): bankAccount(n,b) {
}

void checkingAccount:: deposit(double a) {
        bankAccount::deposit(a);
        transactionCount++;
    }
void checkingAccount:: withdraw (double r) {
        bankAccount:: withdraw(r);
        transactionCount++;
    }
void checkingAccount::deductFees() {
    //double balance= getBalance();
    double r= TRANSACTION_FEE*transactionCount;
    withdraw(r);
    //return the new balance of the checking account
    transactionCount=0;
}
