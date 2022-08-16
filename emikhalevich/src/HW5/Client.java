package HW5;

import java.util.*;

public class Client {
    private String lastName;
    private int age;

/*    public Client(String lastName, Integer age) {
        this.lastName = lastName;
        this.age = age;
    }*/

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    //  вывод/описания действия
    public String toString() {
        return "Клиент " + lastName;
    }

    // переопределить коробочный метод equals
    public boolean equals(Object obj) {
        Client clientEquals= (Client) obj;
        return Objects.equals(this.lastName, clientEquals.lastName);
    }

}






