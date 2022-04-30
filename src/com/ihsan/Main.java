package com.ihsan;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
//        System.out.println("Hello World");

        ArrayList<Integer> firstArraylist = new ArrayList<Integer>();

        firstArraylist.add(2);
        firstArraylist.add(3);

//        Autoboxing mengubah primitive type menjadi nilai yang disimpan dalam wrapper class (int => Integer, double => Double, etc)
//        Unboxing mengubah wrapper class menjadi primitive type (Integer => int)

        System.out.println(firstArraylist.get(0).intValue());

    }

}
