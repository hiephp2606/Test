package view;

import entities.Person;
import service.Check;
import service.PersonService;

import java.util.List;
import java.util.Scanner;

public class Menu3 {
    PersonService personService = new PersonService();
    Check check = new Check();
    public void displayMenu3 (List<Person> people, int i) {
        System.out.println("Chon hanh dong ban muon thuc hien:\n  1. Thay doi Username\n  2. Thay doi Email\n  3. Thay doi Password\n  4. Logout\n ");
    }

    public void selectMenu3 (Scanner sc, List<Person> people, int i) {
        boolean loop = true;
        System.out.println("============WELCOME " + people.get(i).getUserName() + "============" );
        do {
            displayMenu3(people, i);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.printf("Username: ");
                    String userNameUpdate = sc.nextLine();
                    people.get(i).setUserName(userNameUpdate);
                    System.out.println("Cap nhat Username thanh cong!");
                    break;
                case 2:
                    String EmailUpdate = check.checkEmail(sc);
                    people.get(i).setEmail(EmailUpdate);
                    System.out.println("Cap nhat Email thanh cong!");
                    break;
                case 3:
                    String PasswordUpdate = check.checkPassword(sc);
                    people.get(i).setPassWord(PasswordUpdate);
                    System.out.println("Cap nhat Password thanh cong!");
                    break;
                case 4:
                    loop = false;
                    System.out.println("\n");
                    break;
            }
        }while (loop == true);
    }
}
