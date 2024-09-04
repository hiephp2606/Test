package view;

import entities.ListAccount;
import entities.Account;
import service.ListAccountService;
import service.AccountService;

import java.util.List;
import java.util.Scanner;

public class Menu1 {
    AccountService accountService = new AccountService();
    ListAccountService listAccountService = new ListAccountService();

    public void displayMenu1() {
        System.out.println("============Techmaster_start============");
        System.out.println("1. Dang nhap");
        System.out.println("2. Dang ky");
    }

    public void selectMenu1(Scanner sc, ListAccount listAccount, List<Account> people ) {
        do {
            displayMenu1();
            System.out.print("Lua chon (1 hoac 2): ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("\n* DANG NHAP *");
                    ListAccount listAccount1 = listAccountService.accountLogin(sc, people, people.size());
                    break;
                case 2:
                    System.out.println("\n* DANG KY *");
                    ListAccount listAccount2 = listAccountService.accountRegister(sc, people);
                    break;
            }
            System.out.println(listAccount);
        } while (true);
    }

}







