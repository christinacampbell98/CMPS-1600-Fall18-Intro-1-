//
//  bankAccount.h
//  Lab7
//
//  Created by Christina Campbell on 11/26/18.
//  Copyright © 2018 Christina Campbell. All rights reserved.
//

#ifndef bankAccount_h
#define bankAccount_h
#include <string>
class bankAccount {
public:
    std::string name;
    double balance;
public:
    bankAccount(std::string n, double b);
    std::string getName();
    double getBalance();
    double deposit(double a);
    //create a method that removes a designated amount of money from a specific bank account
    double withdraw (double r);
    void transfer (bankAccount* otherAccount, int r);
    
    std::string toString();
};

#endif /* bankAccount_h */
