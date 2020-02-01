package week1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Type your name: " );
        String nume1 = scanner1.nextLine();
        System.out.printf("Type your age: " );
        int age1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("Type your name: ");
        String nume2 = scanner2.nextLine();
        System.out.printf("Type your age: ");
        int age2 = scanner2.nextInt();

        System.out.println(nume1 + " and " + nume2 + " are " + (age1 + age2) + " years old in total.");









    }
}
