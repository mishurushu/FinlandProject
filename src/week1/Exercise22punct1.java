package week1;

import java.util.Scanner;

public class Exercise22punct1 {
    public static void main(String[] args) {
        System.out.print("Type the password: ");
        Scanner scanner = new Scanner(System.in);
        String parola = scanner.nextLine();
        if(parola.equals("carrot")){
            System.out.println("Right!");
        }else {
            System.out.println("Wrong!");
        }
    }
}
