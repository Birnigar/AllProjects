package day52.warmup;

import day52.warmup.Account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AccountAction {
    public static void main(String[] args) {
        Account a1 = new Account("Nigar", 4520);
        Account a2 = new Account("Hannah", 365214);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a1.getBalance() = " + a1.getBalance());


        a1.deposit(525);
        a2.withdraw(900);
        System.out.println("After deposit and withdraw 1000");
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);



        a1.transferAll(a2);
        System.out.println("After transferAll method:");
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);


        List<Account> lst=new ArrayList<>(Arrays.asList(a1,a2));

        Collections.sort(lst);

        System.out.println(lst);
        System.out.println(a2.isPalindrome());
        List<Account> accountList = new ArrayList<>();
        accountList.add(   new Account("John Snow", 10000)   );
        accountList.add(   new Account("Vald", 11000)   );
        accountList.add(   new Account("Sventlana", 13000)   );
        accountList.add(   new Account("Muhammad", 8000)   );
        accountList.add(   new Account("Emme", 17000)   );
        accountList.add(   new Account("Ata", 15000)   );
        System.out.println("accountList before = \n" + accountList);
        Collections.sort(accountList);


        for(Account eachAccount : accountList){
            eachAccount.transferAll(a1);
        }
        System.out.println("a1 = " + a1);

    }

}
