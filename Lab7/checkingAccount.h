//
//  checkingAccount.h
//  Lab7
//
//  Created by Christina Campbell on 11/26/18.
//  Copyright © 2018 Christina Campbell. All rights reserved.
//

#ifndef checkingAccount_h
#define checkingAccount_h
#include <string>
#include "bankAccount.h"
class checkingAccount: public bankAccount {
    int transactionCount=0;
    const double TRANSACTION_FEE=3.00;
public:
    checkingAccount(std::string n, double b);
    void deductFees();
    void deposit(double a);
    void withdraw(double r );
};

#endif /* checkingAccount_h */
