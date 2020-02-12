package week2;

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type numbers: ");
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
        }
    }
}