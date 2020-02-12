package week2;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many? ");
        int number = scanner.nextInt();
        for (int i = 0; i <number ; i++) {
            printeaza();
        }
    }

    public static void printeaza(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

}
