package service;

import entities.Account;
import entities.Person;
import view.Menu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountService {
    PersonService personService = new PersonService();
    List<Person> people = new ArrayList<>();
    Menu2 menu2 = new Menu2();

//    Dang ky
    public Account accountRegister (Scanner sc, List<Person> people) {
        Person person = personService.personRegister(sc);
        int size = people.size();
        if (size > 0) {
            for (int i = 0; i < size; i++ ) {
                if (person.getUserName().equals(people.get(i).getUserName()) || person.getEmail().equals(people.get(i).getEmail())) {
                    if (person.getUserName().equals(people.get(i).getUserName()) && person.getEmail().equals(people.get(i).getEmail())) {
                        System.out.println("Username va Email da duoc su dung, xin vui long nhap lai Username va Email khac!");
                    }
                    else if (person.getUserName().equals(people.get(i).getUserName())) {
                        System.out.println("Username nay da ton tai, xin vui long chon ten khac!");
                    }
                    else {
                        System.out.println("Email nay da duoc su dung, xin vui long nhap Email khac!");
                    }
                    people.remove(person);
                    break;
                }
                else if (i == size - 1) {
                    people.add(person);
                    System.out.println("Dang ky thanh cong!");
                }
                else {}
            }
        }
        else {
            people.add(person);
            System.out.println("Dang ky thanh cong!");
        }

        return new Account(people);
    }



//    Dang nhap
    public Account accountLogin (Scanner sc, List<Person> people, int size) {
            Person person = personService.personLogin(sc);
            for (int i = 0; i < size; i++) {
                if (person.getUserName().equals(people.get(i).getUserName()) && person.getPassWord().equals(people.get(i).getPassWord())) {
                    System.out.println("Dang nhap thanh cong!");
                    break;
                }
                else if (i == size - 1){
                    if (person.getUserName().equals(people.get(i).getUserName())) {
                        System.out.println("Password nhap sai!");
                        menu2.selectMenu2(sc, people, i);
                    }
                    else {
                        System.out.println("Username khong ton tai!");
                    }
                }
            }
            return new Account(people);
    }

}
