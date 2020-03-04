package week3;

import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String nume = scanner.nextLine();
        System.out.println("Last char is: " + calculateCharacters(nume));

    }

    public static char calculateCharacters(String text){
        return text.charAt(text.length() - 1);
    }
}
