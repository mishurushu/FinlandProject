package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise64 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer deVerificat;
        do {
            System.out.print("Type your int and if you want to stop press '0' : ");
            deVerificat = scanner.nextInt();
            arrayList.add(deVerificat);
        } while (deVerificat != 0);
        removeLast(arrayList);
        System.out.print("Average is : " + average(arrayList));

    }




    public static int sum(ArrayList<Integer> list){
        Integer suma = 0 ;
        for ( Integer numar : list ){
            suma += numar;
        }
        return suma;

    }

    public static double average(ArrayList<Integer> list) {
        double total = sum(list);
        double average=0.0;

        return average = total/list.size();
    }

    public static void removeLast(ArrayList<Integer> list){
        list.remove(list.size() - 1);
        System.out.println(list);
    }
}
