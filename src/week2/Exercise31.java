package week2;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First: ");
        int numar = scanner.nextInt();
        System.out.print("Last: ");
        int maxim = scanner.nextInt();
        for(int i = numar; i<= maxim;i++){
            System.out.println(i);
        }
        }
    }


