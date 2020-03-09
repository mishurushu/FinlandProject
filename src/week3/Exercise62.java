package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise62 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String deVerificat = "";
        do{
            System.out.print("Type your word: ");
            deVerificat = scanner.nextLine();
            arrayList.add(deVerificat);
        }while (!deVerificat.equals(""));
        System.out.print("You typed the following words after remove last ");
        removeLast(arrayList);




    }

    public static void removeLast(ArrayList<String> list){
        list.remove(list.size() - 2);
        System.out.println(list);
    }
}
