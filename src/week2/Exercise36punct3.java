package week2;

import java.util.Scanner;

public class Exercise36punct3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type numbers: ");
        int suma = 0;
        int counter = 0;
        while (true) {
            int number = scanner.nextInt();
            suma += number;
            counter++;
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + suma);
                System.out.println("How many numbers: " + counter);
                break;
            }
        }
    }
}
