package HW5;

import java.util.*;

public class Client {
    private String lastName;
    private int age;
    Account [] account;
    ArrayList<Client> clientArrayList;

    public int setAge(int id) {
        this.age = id;
        return id;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public String getLastName() {
        return lastName;
    }

    //переопределила коробочный метод
/*    public boolean equals(Object obj) {
        Client client2 = (Client) obj;
        return this.lastName == client2.lastName & this.id == client2.id;
    }*/
}

