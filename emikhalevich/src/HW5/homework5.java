package HW5;

import java.util.*;

public class homework5 {
//    public static Account getAccounts() {
//        System.out.println();
//        return ();
//    }
//
//    public static Client getClient() {
//        return ();
//    }

    public static void main(String[] args) {
        HashMap <String, Integer> ListClients = new HashMap<>();
        ListClients.put ("Иванов", 35);
        ListClients.put ("Федоров", 20);
        ListClients.put ("Сидоров", 55);
//        System.out.println(ListClients);

        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        client1.setLastName("Иванов");
        client1.setAge(35);
        client2.setLastName("Федоров");
        client2.setAge(20);
        client3.setLastName("Сидоров");
        client3.setAge(55);

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        Account account1 = new Account();
        account1.client = client1;
        account1.id = ("Счёт 001");
        Account account2 = new Account();
        account2.client = client1;
        account2.id = ("Счёт 006");
        Account account3 = new Account();
        account3.client= client1;
        account3.id = ("Счёт 004");
        Account account4 = new Account();
        account4.client = client2;
        account4.id = ("Счёт 002");
        Account account5 = new Account();
        account5.client = client2;
        account5.id = ("Счёт 005");
        Account account6 = new Account();
        account6.client = client3;
        account6.id = ("Счёт 003");


        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
//        accounts.add(account4);
//        accounts.add(account5);
//        accounts.add(account6);

//        Collections.sort(accounts); // сортировка объектов?

        int k = accounts.size() - 1;
/*        Scanner scanClient = new Scanner(System.in);
        String accountScan = scanClient.next();*/
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

/*        Scanner scanAccount = new Scanner(System.in);
        String clientScan = scanAccount.next();*/
        Account currentAcc = new Account();
        currentAcc.id = "Счёт 004";
        //клиент как объект
        //функции
        //equals HashCode + HashMap
//        HashMap<Client, ArrayList<Account>>
        for (int j = 0; j <= k; j++) {
            if (accounts.get(j).equals(currentAcc)) {
                System.out.println(accounts.get(j).client.getLastName());

            }
            System.out.println(accounts.get(j).id);
        }
    }
}

