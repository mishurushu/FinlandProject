package week3;

import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String nume = scanner.nextLine();
        System.out.println("Number of chars = " + calculateCharacters(nume));

    }

    public static int calculateCharacters(String text){
        return text.length();
    }
}
