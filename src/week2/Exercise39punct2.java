package week2;

public class Exercise39punct2 {
    public static void main(String[] args) {
        printStars(4);
        printStars(4);
        printStars(4);
        printStars(4);
    }

    private static void printStars(int amount){
        for (int i = 0; i < amount ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
