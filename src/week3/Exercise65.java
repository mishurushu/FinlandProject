package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise65 {
    public static void main(String[] args) {
          ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String valoare = "";
        do {
            System.out.print("Add your word: ");
            valoare = scanner.nextLine();
            lista.add(valoare);
        }while (!valoare.equals(""));
        ArrayList<Integer> lengths = lista(lista);
        System.out.println("The lengths of the Strings: " + lengths);


    }

    public static ArrayList lista (ArrayList<String> strings){
        ArrayList adauga = new ArrayList<>();
        adauga.add(strings);
        return adauga;
    }

}
