package view;

import entities.Account;
import entities.Person;
import service.AccountService;
import service.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu1 {
    PersonService personService = new PersonService();
    AccountService accountService = new AccountService();

    public void displayMenu1() {
        System.out.println("============Techmaster_start============");
        System.out.println("1. Dang nhap");
        System.out.println("2. Dang ky");
    }

    public void selectMenu1(Scanner sc,Account account, List<Person> people ) {
        do {
            displayMenu1();
            System.out.print("Lua chon (1 hoac 2): ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("\n* DANG NHAP *");
                    Account account1 = accountService.accountLogin(sc, people, people.size());
                    break;
                case 2:
                    System.out.println("\n* DANG KY *");
                    Account account2 = accountService.accountRegister(sc, people);
                    break;
            }
            System.out.println(account);
        } while (true);
    }

}







