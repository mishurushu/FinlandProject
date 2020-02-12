package week2;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
            System.out.print("Type a number: ");
            Scanner scanner = new Scanner(System.in);
            int numar = scanner.nextInt();
            int factorial = 1;
            int i = 1;
            while (i <= numar){
                factorial *= i;
                i++;
            }
            System.out.println("Factorial is " + factorial);
        }
    }
