//
//  savingsAccount.cpp
//  Lab7
//
//  Created by Christina Campbell on 11/26/18.
//  Copyright © 2018 Christina Campbell. All rights reserved.
//

#include "savingsAccount.h"
#include <string>
savingsAccount:: savingsAccount(std::string n, double b,double ir): bankAccount(n,b) {
    interestRate=ir;
    }
void savingsAccount::addInterest( ) {
    double add= (interestRate/100)* (getBalance());
    deposit(add);
    }
