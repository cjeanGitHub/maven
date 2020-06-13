package com.cjean.exercise.exercise01.base.breakdemo;

public class BreakDemo05 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (2 == i && 1 == j) break;
            }
        }

    }

}
