package week1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner raza = new Scanner(System.in);
        System.out.printf("Type the radius: ");
        double razaCercului = raza.nextInt();
        double circumferinta = 2 * Math.PI * razaCercului;
        System.out.printf("Circumference of the circle : " +  circumferinta);
    }
}
