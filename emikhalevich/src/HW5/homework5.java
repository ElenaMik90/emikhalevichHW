package HW5;

import java.util.*;
import java.util.stream.Collectors;

public class homework5 {

    public static void main(String[] arg) {
        Client client1 = new Client();
        Client client2 = new Client();
        client1.lastName = "Иванов";
        client1.id = 123;
        client2.id = 1234;
        client2.lastName = "Иванов";
System.out.println (client1.equals( client2) );

    }
}
