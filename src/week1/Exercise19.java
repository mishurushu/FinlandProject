package week1;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("How old are you? ");
        int age = scanner.nextInt();

        if(age >= 1 && age <= 120){
            System.out.println("Ok");
        }else{
            System.out.println("Impossible!");
        }
    }
}
