package week2;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First: ");
        int numar = scanner.nextInt();
        System.out.print("Last: ");
        int maxim = scanner.nextInt();
        int suma = 0;
        int i = numar;
        while ( i <= maxim ){
            suma += i;
            i++;
        }
        System.out.println("Sum is " + suma);

    }
}
