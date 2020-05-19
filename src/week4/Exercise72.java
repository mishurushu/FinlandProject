package week4;

public class Exercise72 {

    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000);
    }
}



class Account{
String accountName;
Integer balance;

    public Account(String accountName, Integer balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
}
