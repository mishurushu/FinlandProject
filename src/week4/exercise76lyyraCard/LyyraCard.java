package week4.exercise76lyyraCard;

public class LyyraCard {

    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public void payEconomical() {
        if(balance <2.50){
            System.out.println("Insufficient founds");
        }else this.balance -= 2.50;
    }

    public void payGourmet() {
        if(balance <4.00){
            System.out.println("Insufficient founds");
        }else this.balance -= 4.00;
    }

    public void loadMoney(double amount) {
        balance += amount;
        if(balance >= 150){
            balance = 150;
            System.out.print("Maximum amount is 150:  ");
        }
        if (balance < 0){
            System.out.println("You can't have negative balance");
        }
    }











    @Override
    public String toString() {
        return "LyyraCard{" +
                "balance=" + balance +
                '}';
    }
}
