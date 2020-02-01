package week1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type a number: ");
        int numberA = scanner.nextInt();
        System.out.printf("Type another number: ");
        int numberB = scanner.nextInt();
        int sum = numberA + numberB;
        System.out.println("Sum of the numbers: " + sum);
    }
}
