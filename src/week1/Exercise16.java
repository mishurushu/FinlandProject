package week1;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type a number: ");
        int number = scanner.nextInt();
        if((number%2)==0){
            System.out.println("Number " + number + " is even.");
        }else{
            System.out.println("Number " + number + " is odd.");
        }
    }
}
