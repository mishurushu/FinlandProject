package week4;

public class Product {

    String name;
    double price;
    int amount;

    Product(String name,double price,int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void printProduct(Product product){
        System.out.println(product);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
