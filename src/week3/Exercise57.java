package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        String word = "";
        do {
            System.out.print("Type your word: ");
            word = scanner.nextLine();
            arrayList.add(word);
        }while (!word.equals(""));
        System.out.println("You typed the following words: ");
        for (String print : arrayList) {
            System.out.println(print);
        }
    }
}
