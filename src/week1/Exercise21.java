package week1;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type a year: ");
        int year = scanner.nextInt();
        boolean anBisect = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    anBisect = true;
                else
                    anBisect = false;
            }
            else
                anBisect = true;
        }
        else
            anBisect = false;
        if(anBisect){
            System.out.println("The year is a leap year.");
        }
        else{
            System.out.println("The year is not a leap year.");
        }

    }

}



