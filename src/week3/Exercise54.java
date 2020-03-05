package week3;

import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a word: ");
        String cuvant = scanner.nextLine();
        System.out.print("Length of the first part: ");
        int lenght = scanner.nextInt();
        String subString = cuvant.substring(lenght - 1);
        System.out.println("Result: " + subString);
    }
}
