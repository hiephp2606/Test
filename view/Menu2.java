package view;

import entities.Account;

import java.util.List;
import java.util.Scanner;

public class Menu2 {
    public void displayMenu2() {
        System.out.println("Quen mat khau? (y/n)");
    }

    public void selectMenu2(Scanner sc, List<Account> people, int i) {
        displayMenu2();
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Nhap Email de xac minh");
            String email = sc.nextLine();
            if (email.equals(people.get(i).getEmail())) {
                System.out.println("Dang nhap thanh cong!");
                System.out.printf("Cap nhat lai mat khau cua ban: ");
                String updatePassword = sc.nextLine();
                people.get(i).setPassWord(updatePassword);
                System.out.println("Cap nhat mat khau thanh cong! \n");
            }
            else {
                System.out.println("Email khong ton tai, vui long tao tai khoan hoac thu lai!");
            }
        }
        else {

        }
    }
}
