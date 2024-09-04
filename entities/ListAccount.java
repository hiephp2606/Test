package entities;

import java.util.List;

public class ListAccount {
    private List<Account> accounts;

    public ListAccount(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getPerson() {
        return accounts;
    }

    public void setPerson(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Account{" +
                "person=" + accounts +
                '}';
    }
}
