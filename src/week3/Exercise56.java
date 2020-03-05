package week3;

import java.util.Scanner;

public class Exercise56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = scanner.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

    public static StringBuilder reverse(String text){
        StringBuilder stringBuilde = new StringBuilder(text);
        return stringBuilde.reverse();
    }

}
