package HW5;

import java.util.HashSet;
import java.util.Objects;

public class Account extends HashSet<Account> {
    private int id;

    public boolean equals(Object obj) {
        Account account2 = (Account) obj;
        return Objects.equals(this.id, account2.id);
    }

    public Account(Integer id) {
        this.id = id;
    }
    public Integer getID() {
        return id;
    }
    // вывод описания действия
    public String toString() {
        return " Реквизит:" + id;
    }
}
