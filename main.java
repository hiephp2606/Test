import entities.ListAccount;
import entities.Account;
import view.Menu1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu1 menu1 = new Menu1();
        List<Account> accountList = new ArrayList<>();
        ListAccount listAccount = new ListAccount(accountList);

        menu1.selectMenu1(sc, listAccount, accountList);
    }
}
