package week1;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type the points [0-60]: ");
        int point = scanner.nextInt();

        if(point < 0){
            System.out.println("Put points between 0 - 60");
        }else if(point < 30){
            System.out.println("Fail");
        }else if(point < 35 ){
            System.out.println("Grade: 1");
        }else if(point < 40){
            System.out.println("Grade: 2");
        }else if(point < 45){
            System.out.println("Grade: 3");
        }else if (point < 50){
            System.out.println("Grade: 4");
        }else if (point <= 60){
            System.out.println("Grade: 5");
        }else{
            System.out.println("Put points between 0 - 60");
        }
    }
}
