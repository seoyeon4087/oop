package controller;

import builder.AccountBuilder;
import model.AccountDTO;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService accountcontroller;

    public AccountController() {
        this.accountcontroller = AccountServiceImpl.getInstance;
    }

    public String createAccount(Scanner sc) {
        return accountcontroller.createAccount(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String deposit(Scanner sc) {
        return accountcontroller.deposit(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String withdraw(Scanner sc) {
        return accountcontroller.withdraw(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String getBalance(Scanner sc) {
        return accountcontroller.getBalance(sc.next());
    }
    public String cancelAccount(Scanner sc) {
        return accountcontroller.cancelAccount();
    }

    public String getAccount(Scanner sc) {
        return null;
    }

//    public String getAccount(Scanner sc) {
//    }
}
