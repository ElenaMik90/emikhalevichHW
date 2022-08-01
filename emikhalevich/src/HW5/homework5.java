package HW5;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class homework5 {
//    public static Account getAccounts() {
//        System.out.println();
//        return ();
//    }
//
//    public static Client getClient() {
//        return ();
//    }

    //  public static void main(String[] args) {

//        класс клиент , класс аккаунт
    // поиск из HashMap!

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

        Map<Integer, Client> sortedAccountsMap = new TreeMap<Integer, Client>(accountsMap);
     //   sortedAccountsMap.entrySet().forEach(System.out::println);


/*      System.out.println(sortedAccountsMap);
        System.out.println(sortedAccountsMap.keySet());
        System.out.println(sortedAccountsMap.values());*/
        System.out.println(sortedAccountsMap.get(100000004));
        //System.out.println(sortedAccountsMap.entrySet());

        Map<Integer, Client> mapClient = new HashMap<>();
        for (Entry<Integer, Client> entry : mapClient.entrySet()) {
            var key = entry.getKey();
            var values = mapClient.values();
            System.out.println(key);
            for (Client clients : values) {
                System.out.println(key);
            }
            System.out.println("+++++++++++++++");
        }


/*        for (Map.Entry<Integer, Client> item : sortedAccountsMap.entrySet()) {
            System.out.println("Ключ: " + item.getKey() + " Значение: " + item.getValue().getLastName());
        }*/

            Account account1 = new Account(11000011);
            Account account2 = new Account(11000022);
            Account account3 = new Account(11000033);
            Account account4 = new Account(11000044);
            Account account5 = new Account(11000055);
            Account account6 = new Account(11000066);


            HashMap<HashSet<Account>, Client> ListClients = new HashMap<>();
            HashMap<Client, HashSet<Account>> ListClients1 = new HashMap<>();

            HashSet<Account> accountClient1 = new HashSet<Account>();
            accountClient1.add(account1);
            accountClient1.add(account2);
            accountClient1.add(account3);

            HashSet<Account> accountClient2 = new HashSet<Account>();
            accountClient2.add(account4);
            accountClient2.add(account5);

            HashSet<Account> accountClient3 = new HashSet<Account>();
            accountClient3.add(account6);

            ListClients1.put(client1, accountClient1);
            ListClients1.put(client2, accountClient2);
            ListClients1.put(client3, accountClient3);
        }
    }


    /*ArrayList<Client> clients = new ArrayList<>();
    clients.add(client1);
    clients.add(client2);
    clients.add(client3);
*/


/*        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        int k = accounts.size() - 1;
*//*        Scanner scanClient = new Scanner(System.in);
        String accountScan = scanClient.next();*//*
        int age = 35;
        String lastName = "Иванов";
        Client currentClient = new Client();
        currentClient.setLastName(lastName);
        currentClient.setAge(age);
//
        ArrayList<Account> currentAccount = new ArrayList<>();
        //ввести имя
        //создать объект клиент
        for (int i = 0; i <= k; i++) {
//            if (accounts.get(i).client.getLastName().equals(accountScan)) {
            if (accounts.get(i).client.equals(currentAccount)) {
                System.out.println(accounts.get(i).client.getLastName() + "\t" + accounts.get(i).id);
                currentAccount.add(accounts.get(i));
            }
        }
        Account currentAcc = new Account();
        currentAcc.id = "Счёт 004";
        //клиент как объект
        //функции
        //equals HashCode + HashMap
//        HashMap<Client, ArrayList<Account>>
        for (int j = 0; j <= k; j++) {
            if (accounts.get(j).equals(currentAcc)) {
        //        System.out.println(accounts.get(j).client.getLastName());

            }
          //  System.out.println(accounts.get(j).id);
        }*/


/*        ListClients.put(client1,new HashSet<>(account1) );
        ListClients.put(client1,new HashSet<>(account2) );
        ListClients.put(client1,new HashSet<>(account3) );
        ListClients.put(client2,new HashSet<>(account4) );
        ListClients.put(client2,new HashSet<>(account5) );
        ListClients.put(client3,new HashSet<>(account6) );*/
