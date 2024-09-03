package view;

import entities.Account;
import entities.Person;
import service.AccountService;

import java.util.List;
import java.util.Scanner;

public class Menu2 {
    public void displayMenu2() {
        System.out.println("Quen mat khau? (y/n)");
    }

    public void selectMenu2(Scanner sc, List<Person> people, int i) {
        displayMenu2();
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Nhap Email de xac minh");
            String email = sc.nextLine();
            if (email.equals(people.get(i).getEmail())) {
                System.out.println("Dang nhap thanh cong!");
            }
            else {
                System.out.println("Email khong ton tai, vui long tao tai khoan hoac thu lai!");
            }
        }
        else {

        }
    }
}
