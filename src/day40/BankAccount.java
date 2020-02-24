package day40;

public class BankAccount {
    String accountTypes;
    String accountHolder;
    long accountNumber;
    double balance;

    //setAllTheValue
    public void setAllTheValue(String newAccountType,String newAccountHolder,long newAccountNumber,double newBalance){
        accountTypes=newAccountType;
        accountHolder=newAccountHolder;
        accountNumber=newAccountNumber;
        balance=newBalance;
    }



    //showAccountBalance
    public void showAccountBalance(){
        System.out.println("Current Balance = " + balance);

    }

    //showAccountHolderAccountType
    public  void showAccountHolderAccountType(){
        System.out.println("accountTypes = " + accountTypes);
    }

    //getBalance return the balance
    public double getBalance(){
        return  balance;
    }

    //deposit( amount)
    public void deposit(double amount){
        balance+=amount;
    }


    //withdraw(amount)
    public void withdraw(double amount){
        balance-=amount;
    }

    //withdraw100$Cash()
    public void withdraw100$Cash(){
        withdraw(100);
    }


    //purchaseProduct( productPrice ,count)
    public void purchaseProduct(double productPrice ,int count){
        double totalPrice=productPrice*count;
        balance-=totalPrice;
        //withdraw(totalPrice);
    }

    //toString
    public String toString() {
        return "BankAccount{" +
                "accountTypes='" + accountTypes + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
