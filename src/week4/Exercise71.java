package week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise71 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your number in linst: ");
        Integer add1 = scanner.nextInt();
        list1.add(add1);
        System.out.print("Enter your number in linst: ");
        Integer add2 = scanner.nextInt();
        list1.add(add2);
        System.out.print("Enter your number in linst: ");
        Integer add3 = scanner.nextInt();
        list1.add(add3);
        System.out.print("Enter your number in linst: ");
        Integer add4 = scanner.nextInt();
        list1.add(add4);
        System.out.println("Your first list is: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter your number in linst: ");
        Integer add5 = scanner.nextInt();
        list2.add(add5);
        System.out.print("Enter your number in linst: ");
        Integer add6 = scanner.nextInt();
        list2.add(add6);
        System.out.print("Enter your number in linst: ");
        Integer add7 = scanner.nextInt();
        list2.add(add7);
        System.out.print("Enter your number in linst: ");
        Integer add8 = scanner.nextInt();
        list2.add(add8);
        System.out.println("Your second list is: " + list2);

        combine(list1,list2);

        System.out.println(list1);
    }

    public static void combine (ArrayList<Integer> first , ArrayList<Integer> second){
        if (first.contains(second)){
            System.out.print("This number is in first list add a new number: ");
            Scanner scanner = new Scanner(System.in);
            Integer a = scanner.nextInt();
            first.add(a);
        }else first.addAll(second);

    }


}
