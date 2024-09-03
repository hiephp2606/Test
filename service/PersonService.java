package service;

import entities.Person;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonService {
    Check check = new Check();
    public Person personRegister (Scanner sc) {
        System.out.printf("Username: ");
        String username = sc.nextLine();
        String password = check.checkPassword(sc);
        String email = check.checkEmail(sc);

        return new Person(username, password, email);

    }

    public Person personLogin(Scanner sc) {
        System.out.printf("Username: ");
        String username = sc.nextLine();
        System.out.printf("Password: ");
        String password = sc.nextLine();
        String email="";

        return new Person(username, password, email);
    }

}
