package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String word = "";
        while (true){
            System.out.print("Type a word: ");
            word = scanner.nextLine();
            if(arrayList.contains(word)){
                break;
            }else {
                arrayList.add(word);
            }
        }
        System.out.println("You typed the following words: ");
        for (String print : arrayList) {
            System.out.println(print);
        }
    }
}
