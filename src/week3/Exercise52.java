package week3;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String nume = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(nume);
        System.out.println("In reverse order: " + stringBuilder.reverse());
    }


}
