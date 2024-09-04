package service;

import entities.Account;

import java.util.Scanner;

public class AccountService {
    Check check = new Check();
    public Account personRegister (Scanner sc) {
        System.out.printf("Username: ");
        String username = sc.nextLine();
        String password = check.checkPassword(sc);
        String email = check.checkEmail(sc);

        return new Account(username, password, email);

    }

    public Account personLogin(Scanner sc) {
        System.out.printf("Username: ");
        String username = sc.nextLine();
        System.out.printf("Password: ");
        String password = sc.nextLine();
        String email="";

        return new Account(username, password, email);
    }

}
