package week1;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type a number: ");
        int numberA = scanner.nextInt();
        System.out.printf("Type another number: ");
        int numberB = scanner.nextInt();
        System.out.println("The bigger number of the two numbers given was: " + Math.max(numberA, numberB));
    }
}
