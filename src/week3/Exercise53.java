package week3;

import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a word: ");
        String cuvant = scanner.nextLine();
        System.out.print("Length of the first part: ");
        int lenght = scanner.nextInt();
        String subString = cuvant.substring(0,lenght);
        System.out.println("Result: " + subString);
    }
}
