package HW5;

import java.util.*;

public class Client {
    private String lastName;
    private int age;

    public Client(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }

    public Client() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Client client = (Client) o;
        return age == client.age && Objects.equals(lastName, client.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }
}






