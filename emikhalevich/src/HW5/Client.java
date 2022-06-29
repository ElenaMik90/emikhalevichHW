package HW5;

import java.util.*;

public class Client {
    String lastName;
    int id;
    ArrayList<Account> accounts;
    public boolean equals(Object obj) {
        Client client2 = (Client)obj;
        return this.lastName == client2.lastName & this.id == client2.id;
    }

}

