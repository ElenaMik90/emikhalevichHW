package HW5;

/*Нужно реализовать следующую функциональность :
        - Найти все счета по клиенту (например List<Account>
        getAccounts(Client client) )
        - Найти клиента по счету (например Client findClient(Account
        account) )*/

import java.util.*;

import static java.util.Comparator.comparing;


public class homework5 {
    public static Account getAccounts() {
        System.out.println();
        return (null);
    }

    public static Client getClient() {
        return (null);
    }

    public static void main(String[] args) {
        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        client1.setLastName("Иванов");
        client1.setId(35);
        client2.setLastName("Федоров");
        client2.setId(20);
        client3.setLastName("Сидоров");
        client3.setId(55);
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        Account account1 = new Account();
        account1.clients = client1.getLastName()+ "\t" + client1.getId();
        account1.bankAccount = ("Счёт 001");
        Account account2 = new Account();
        account2.clients = client1.getLastName()+ "\t" +  client1.getId();
        account2.bankAccount = ("Счёт 002");
        Account account3 = new Account();
        account3.clients = client1.getLastName()+ "\t" + client1.getId();
        account3.bankAccount = ("Счёт 003");
        Account account4 = new Account();
        account4.clients = client2.getLastName()+ "\t" + client2.getId();
        account4.bankAccount = ("Счёт 004");
        Account account5 = new Account();
        account5.clients = client2.getLastName()+ "\t" + client2.getId();
        account5.bankAccount = ("Счёт 005");
        Account account6 = new Account();
        account6.clients = client3.getLastName() + "\t" +  client3.getId();
        account6.bankAccount = ("Счёт 006");
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);
        accounts.add(account6);
  //     System.out.println(accounts.get(3).clients + "\t" + accounts.get(3).bankAccount);

        clients.sort(comparing(Client::getLastName));
        int k = clients.size() - 1;
        Scanner scan = new Scanner(System.in);
        String clientCheck = scan.next();
        for (int i = 0; i <= k; i++) {
            if (clients.get(i).getId() > 21 & clients.get(i).getLastName() == clientCheck)
                System.out.println(clients.get(i));
        }
    }
}

