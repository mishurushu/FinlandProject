package week1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type a number: ");
        double numberA = scanner.nextInt();
        System.out.printf("Type another number: ");
        double numberB = scanner.nextInt();
        double division = numberA / numberB;
        System.out.println("Division: " + numberA + " / " + numberB + " = " + division);
    }
}
