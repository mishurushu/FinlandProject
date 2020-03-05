package week3;

import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name : ");
        String nume = scanner.nextLine();
        if (nume.length() <= 2) {
            System.out.println( "Type your name: " + nume);
        } else {
            System.out.println("1. character: " + nume.charAt(0));
            System.out.println("2. character: " + nume.charAt(1));
            System.out.println("1. character: " + nume.charAt(2));
        }
    }
}
