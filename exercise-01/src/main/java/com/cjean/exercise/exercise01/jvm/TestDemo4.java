package com.cjean.exercise.exercise01.jvm;

public class TestDemo4 {

    public static void m0(){
        int a = 2;
    }

    public static int m1(){
        int a = 2;
        return a;
    }
    public static int m2(int a){
        int b = a+1;
        return b;
    }

    public static void m3(){
        String b = "123";
    }
    public static String m4(int a){
        String b = "123";
        return b;
    }
    public static int m5(int a){
        String b = "123";
        return a;
    }
    public static long m6(){
        long L = 2L;
        return L;
    }
    public static double m7(){
        double L = 2;
        return L;
    }
    public static float m8(){
        float L = 2;
        return L;
    }

    public void m9(){

    }

    public static void main(String[] args) {
        int i;
        int j = 0;

        i = m2(j);



    }
}
