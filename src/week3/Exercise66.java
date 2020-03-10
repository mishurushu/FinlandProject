package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise66 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int conditie = 0;
        do{
            System.out.print("Enter your integer , if you want to stop press 0: ");
            conditie = scanner.nextInt();
            arrayList.add(conditie);
        }while (conditie != 0);
        int greatest = greatest(arrayList);
        System.out.println("The greatest number is: " + greatest);

    }

    public static int greatest(ArrayList<Integer> list) {
        int greatestInt = list.get(0);

        for (Integer item : list){
            if (item > greatestInt){
                greatestInt = item;
            }
        }
        return greatestInt;
    }

}
