package com.cjean.exercise.exercise01.base.breakdemo;

public class BreakDemo08 {
    public static void main(String[] args) {

        OUT1:
        for (int i = 0; i < 5; i++) {
            OUT2:
            for (int j = 0; j < 3; j++) {
                if (2 == i && 1 == j) break OUT1;
            }
        }

    }

}
