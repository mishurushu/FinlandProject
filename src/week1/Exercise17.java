package week1;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type the first number: ");
        int number1 = scanner.nextInt();
        System.out.printf("Type the second number: ");
        int number2 = scanner.nextInt();

        if(number1 > number2){
            System.out.println("Greater number: " + number1);
        }else if(number1 < number2){
            System.out.println("Greater number: " + number2);
        }else if(number1 == number2) {
            System.out.println("The numbers are equal!");
        }

    }
}
