package com.cjean.exercise.exercise01.juc.container;

import java.util.ArrayList;
import java.util.List;

public class Demo_List {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Object[] objects = integers.toArray();

        Long[] objects1 = (Long[])integers.toArray();
        System.out.println("11111");

    }
}
