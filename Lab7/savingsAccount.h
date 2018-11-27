//
//  savingsAccount.h
//  Lab7
//
//  Created by Christina Campbell on 11/26/18.
//  Copyright © 2018 Christina Campbell. All rights reserved.
//

#ifndef savingsAccount_h
#define savingsAccount_h
#include "bankAccount.h"
#include <string>
class savingsAccount: public bankAccount {
public:
    double interestRate;
    savingsAccount();
    savingsAccount(std::string n, double b,double ir);
    void addInterest( );
};

#endif /* savingsAccount_h */
