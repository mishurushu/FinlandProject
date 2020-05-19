package week4;

public class Exercise72 {

    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        matt.withdrawal(100);
        matt.withdrawal(100);
        myAccount.deposit(1000);
        System.out.println(matt);
        System.out.println(myAccount);

        Account a = new Account("A account", 100);
        Account b = new Account("B account", 0);
        Account c = new Account("C account", 0);
        a.transfer(a,b,50);
        b.transfer(b,c,25);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}



class Account{
String accountName;
double balance;

    public Account(String accountName, Integer balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    public void transfer(Account from, Account to, double howMuch){
        from.balance -= howMuch;
        to.balance += howMuch ;
    }

    @Override
    public String toString() {
        return accountName + " balance: " + balance;
    }
}

