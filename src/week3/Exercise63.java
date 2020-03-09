package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise63 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer deVerificat ;
        do{
            System.out.print("Type your int and if you want to stop press '0' : ");
            deVerificat = scanner.nextInt();
            arrayList.add(deVerificat);
        }while (deVerificat != 0);
        System.out.print("Sume is " + sum(arrayList));





    }

    public static int sum(ArrayList<Integer> list){
        Integer suma = 0 ;
        for ( Integer numar : list ){
            suma += numar;
        }
        return suma;

    }
}
