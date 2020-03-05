package week3;

import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        for (int i = 0; i <name.length() ; i++) {
            int j = 1 ;
            System.out.println((j += i) + "." + "character: " + name.charAt(i));

        }
    }
}
