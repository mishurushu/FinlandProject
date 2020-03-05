package week3;

import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Type the second word: ");
        String second = scanner.nextLine();
        Boolean verificare = firstWord.contains(second);
        System.out.println(verificare);
        if (verificare == true){
            System.out.println("The word " + second + " is found in the word " + firstWord + ".");
        }else if (verificare == false) {
            System.out.println("The word " + second + " is not found in the word" + firstWord + ".");
        }
    }
}
