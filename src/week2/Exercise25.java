package week2;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.print("Type the first number: ");
        int read = reader.nextInt();
        sum = sum + read ;
        System.out.print("Type the second number: ");
        sum = sum + reader.nextInt();
        System.out.print("Type the third number: ");
        sum = sum + reader.nextInt();

        System.out.println("Sum: " + sum);



    }
}
