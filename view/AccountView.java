package view;

import controller.AccountController;
import model.AccountDTO;

import java.util.List;
import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();

        while(true){
            System.out.println("[Account] 0-Exit\n " +
                    "1-createAccount\n " +
                    "2-deposit\n " +
                    "3-withdraw\n " +
                    "4-getBalance\n " +
                    "5-cancelAccount");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println("1-create Account");
                    System.out.println(accountController.createAccount(sc));
                    break;
                case "2":
                    System.out.println("2-deposit");
                    System.out.println(accountController.deposit(sc));
                    break;
                case "3":
                    System.out.println("3-withdraw");
                    System.out.println(accountController.withdraw(sc));
                    break;
                case "4":
                    System.out.println("4-getBalance");
                    System.out.println(accountController.getBalance(sc));
                    break;
                case "5":
                    System.out.println("5-cancelAccount");
                    System.out.println(accountController.cancelAccount(sc));
                    break;
                case "6":
                    System.out.println("6-getAccount");
                    String temp = accountController.getAccount(sc);
                    break;

            }
        }
    }
}