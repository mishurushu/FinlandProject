package week4;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercise70 {
    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(12);
        first.add(55);
        first.add(22);
        first.add(121);

        second.add(41112);
        second.add(4);
        second.add(441212);
        second.add(441212);



        combineArray(first,second);

        System.out.println(first);


    }

    public static void combineArray(ArrayList<Integer> first , ArrayList<Integer> second){
        first.addAll(second);
    }

}
