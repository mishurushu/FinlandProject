package week2;

public class Exercise39punct3 {
    public static void main(String[] args) {

        printStars(10);
        printStars(10);
        printStars(10);

    }

    private static void printStars(int amount){
        for (int i = 0; i < amount ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
