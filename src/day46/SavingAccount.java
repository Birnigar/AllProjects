package day46;

public class SavingAccount extends BankAccount {

//    String accountHolder;
//    long accountNum;
//    double balance;
      double interestRate;


    public SavingAccount(String accountHolder,long accountNum,double balance,double interestRate ){
        super(accountHolder,accountNum,balance);
        this.interestRate=interestRate;
    }


    public static void main(String[] args) {
        
        SavingAccount s1=new SavingAccount("Muhammed",12345,500,0.042);
        System.out.println("s1 = " + s1);
        
        s1.withdraw(100);
        System.out.println("s1 = " + s1);
        
        s1.deposit(1000);
        System.out.println("s1 = " + s1);
        
        
        
    }

    @Override
    public void withdraw(int amount) {
        
      super.withdraw(amount);
      //balance-=30;
        super.withdraw(30);
       
        
    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount);
        super.deposit((int) (amount*interestRate));
        //balance+=amount+amount*interestRate;

    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
