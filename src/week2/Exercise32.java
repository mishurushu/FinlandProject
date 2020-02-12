package week2;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        System.out.print("Until what? ");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        int suma = 0;
        int i = 0;
        while (i <= numar){
            suma += i;
            i++;
        }
        System.out.println("Sum is " + suma);
    }
}
