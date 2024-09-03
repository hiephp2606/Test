import entities.Account;
import entities.Person;
import service.PersonService;
import view.Menu1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu1 menu1 = new Menu1();
        List<Person> personList = new ArrayList<>();
        Account account = new Account(personList);


        menu1.selectMenu1(sc, account, personList );






    }
}
