package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        ArrayList тузунуз
//        1ден 100го чейинки 50 сан менен толтурунуз
//        Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
//        Аларды консольго чыгарыныз
        Random random = new Random();
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer i: list) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (Integer a: list) {
            if (a % 2 == 1){
                System.out.print(a + " ");
            }

        }






    }
}
