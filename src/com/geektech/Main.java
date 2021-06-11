package com.geektech;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>(Arrays.asList("А1:Аза", "А2:Самат", "А3:Баха", "А4:Жыргалбек", "А5:Нурбек"));
        System.out.println(listA);

        ArrayList<String> listB = new ArrayList<>(Arrays.asList("B1:Кристиано", "B2:Анжелика", "B3:Ариана", "B4:Айлин", "B5:Румпельштильцхен"));
        System.out.println(listB);

        ArrayList<String> listC = new ArrayList<>();
        listC.add(listA.get(0));
        listC.add(listB.get(4));
        listC.add(listA.get(1));
        listC.add(listB.get(3));
        listC.add(listA.get(2));
        listC.add(listB.get(2));
        listC.add(listA.get(3));
        listC.add(listB.get(1));
        listC.add(listA.get(4));
        listC.add(listB.get(0));

        System.out.println(listC);

        listC.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(listC);
    }
}
