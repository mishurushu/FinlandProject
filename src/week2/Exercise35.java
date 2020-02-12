package week2;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        int putere = scanner.nextInt();
        int numarLaPutere = (int)Math.pow(numar,putere);
        int suma = 0;
        int i = 1;
        while (i < putere){
            suma += numarLaPutere;
            i--;
        }
        System.out.println(suma);

    }
}
