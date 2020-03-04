package week2;

public class Exercise39punct4 {
    public static void main(String[] args) {
        printStars(1);
        printStars(2);
        printStars(3);
        printStars(4);
        printStars(5);
        printStars(6);
        printStars(7);
        printStars(8);
        printStars(9);
    }

    private static void printStars(int amount){
        for (int i = 0; i < amount ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
