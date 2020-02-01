package week1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        parolaAleax();
        System.out.println();
        parolaEmily();
        System.out.println();
        parolaEmily();
    }

    public static void parolaAleax(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type your username:");
        String username = scanner.nextLine();
        String realUsername = "alex";
        System.out.printf("Type your password:");
        String password = scanner.nextLine();
        String realPassword = "mightyducks";
        if(username.equals(realUsername) && password.equals(realPassword)){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }
    }

    public static void parolaEmily(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type your username:");
        String username = scanner.nextLine();
        String realUsername = "emily";
        System.out.printf("Type your password:");
        String password = scanner.nextLine();
        String realPassword = "cat";
        if(username.equals(realUsername) && password.equals(realPassword)){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }
    }
// 3:26 alt ceva nu am putut sa gandesc
}
