package service;

import entities.Person;

import java.util.Scanner;

public class PersonService {
    public Person personRegister (Scanner sc) {
        System.out.printf("Username: ");
        String username = sc.nextLine();
        System.out.printf("Password: ");
        String password = sc.nextLine();
        System.out.printf("Email: ");
        String email = sc.nextLine();

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
