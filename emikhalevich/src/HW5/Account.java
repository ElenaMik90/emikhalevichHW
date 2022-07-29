package HW5;

import java.util.Objects;

public class Account {
//    String clients;
    String id;
    Client client;

//    public String getClients(String clients) {
//        this.client =clients;
//        return clients;
//    }
    public boolean equals(Object obj) {
        Account account2 = (Account) obj;
        return Objects.equals(this.id, account2.id);
    }
//
//    public String getClient (){
//        return clients;
//    }
//
//    public String getBankAccount (){
//        return bankAccount;
//    }
}
