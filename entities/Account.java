package entities;

import java.util.List;

public class Account {
    private List<Person> person;

    public Account(List<Person> person) {
        this.person = person;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Account{" +
                "person=" + person +
                '}';
    }
}
