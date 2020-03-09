package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String deVerificat = "";
        do{
            System.out.print("Type your word: ");
            deVerificat = scanner.nextLine();
            arrayList.add(deVerificat);
        }while (!deVerificat.equals(""));
        System.out.print("There are this many items in the list: ");
        counte(arrayList);




    }

    public static void counte(ArrayList<String> list){
        list.remove(0);
        System.out.println(list.size());
        }
    }

