package service;

import entities.ListAccount;
import entities.Account;
import view.Menu2;
import view.Menu3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAccountService {
    AccountService accountService = new AccountService();
    List<Account> people = new ArrayList<>();
    Menu2 menu2 = new Menu2();

//    Dang ky
    public ListAccount accountRegister (Scanner sc, List<Account> people) {
        Account account = accountService.personRegister(sc);
        int size = people.size();
        if (size > 0) {
            for (int i = 0; i < size; i++ ) {
                if (account.getUserName().equals(people.get(i).getUserName()) || account.getEmail().equals(people.get(i).getEmail())) {
                    if (account.getUserName().equals(people.get(i).getUserName()) && account.getEmail().equals(people.get(i).getEmail())) {
                        System.out.println("Username va Email da duoc su dung, xin vui long nhap lai Username va Email khac!\n");
                    }
                    else if (account.getUserName().equals(people.get(i).getUserName())) {
                        System.out.println("Username nay da ton tai, xin vui long chon ten khac!\n");
                    }
                    else {
                        System.out.println("Email nay da duoc su dung, xin vui long nhap Email khac!\n");
                    }
                    people.remove(account);
                    break;
                }
                else if (i == size - 1) {
                    people.add(account);
                    System.out.println("Dang ky thanh cong! \n");
                }
                else {}
            }
        }
        else {
            people.add(account);
            System.out.println("Dang ky thanh cong! \n");
        }

        return new ListAccount(people);
    }



//    Dang nhap
    public ListAccount accountLogin (Scanner sc, List<Account> people, int size) {
            Account account = accountService.personLogin(sc);
            for (int i = 0; i < size; i++) {
                if (account.getUserName().equals(people.get(i).getUserName()) && account.getPassWord().equals(people.get(i).getPassWord())) {
//                    System.out.println("Dang nhap thanh cong!\n \n");
                    Menu3 menu3 = new Menu3();
                    menu3.selectMenu3(sc, people, i);
                    break;
                }
                else if (account.getUserName().equals(people.get(i).getUserName())){
                        System.out.println("Password nhap sai!\n");
                        menu2.selectMenu2(sc, people, i);
                        break;
                }
                else if (i == size -1){
                    System.out.println("Username khong ton tai!\n");
                }
            }
            return new ListAccount(people);
    }

}
