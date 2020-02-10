package week1;

import java.util.Scanner;

public class Exercise22punct2 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Type the password: ");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (command.equals("carrot")) {
                System.out.println("Right!");
                break;
            }else {
                System.out.println("Wrong!");
            }

        }

    }
}
