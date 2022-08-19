package HW5;

import java.util.*;
import java.util.HashMap;


public class homework5 {
    public static void main(String[] args) {
        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        client1.setLastName("Иванов");
        client1.setAge(35);
        client2.setLastName("Федоров");
        client2.setAge(20);
        client3.setLastName("Сидоров");
        client3.setAge(55);

        Map<Integer, Client> accountsMap = new HashMap<>();
        accountsMap.put(100000001, client1);
        accountsMap.put(100000002, client1);
        accountsMap.put(100000003, client1);
        accountsMap.put(100000004, client2);
        accountsMap.put(100000005, client3);
        accountsMap.put(100000006, client3);
        Map<Integer, Client> sortedAccountsMap = new TreeMap(accountsMap);
        System.out.println("Вывод ФИО по аккаунту(здесь id этой key): " + sortedAccountsMap.get(100000001).getLastName());
        System.out.println("-------------------------------");


        HashMap<Client, HashSet<Account>> ListClients;
        {
            Account account1 = new Account(11000011);
            Account account2 = new Account(11000022);
            Account account3 = new Account(11000033);
            Account account4 = new Account(11000044);
            Account account5 = new Account(11000055);
            Account account6 = new Account(11000066);
            ListClients = new HashMap<>();
            HashSet<Account> accountClient1 = new HashSet<>();
            accountClient1.add(account1);
            accountClient1.add(account2);
            accountClient1.add(account3);
            HashSet<Account> accountClient2 = new HashSet<>();
            accountClient2.add(account4);
            accountClient2.add(account5);
            HashSet<Account> accountClient3 = new HashSet<>();
            accountClient3.add(account6);
            ListClients.put(client1, accountClient1);
            ListClients.put(client2, accountClient2);
            ListClients.put(client3, accountClient3);
        }

        String actualFIO = Bank.getFIOByAccount(ListClients);
        System.out.println("Вывод ФИО по номеру счёта: " + actualFIO);
        System.out.println("-------------------------------");


        System.out.println("Получить аккаунт по ФИО: " + Bank.getAccountByFIO(ListClients));

    }
}

