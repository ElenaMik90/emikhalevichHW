package HW5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bank {
    private static String currentFIO = null;
    public static String getFIOByAccount(HashMap<Client, HashSet<Account>> ListClient) {
        Account searchAccount = new Account(11000044);
        for (Map.Entry<Client, HashSet<Account>> entry : ListClient.entrySet()){
            HashSet<Account> currentAccount = entry.getValue();
            for (Account acc : currentAccount ) {
                if (acc.equals(searchAccount)) {
                    currentFIO = entry.getKey().getLastName();
                }
            }
        }
        return currentFIO;
    }

    public static HashSet<Account> getAccountByFIO( HashMap<Client, HashSet<Account>> ListClient) {
        HashSet<Account> currentAccount = null;
        Client searchClient = new Client("Иванов", 35);
        currentAccount = ListClient.get(searchClient);

        return currentAccount;
    }


}
