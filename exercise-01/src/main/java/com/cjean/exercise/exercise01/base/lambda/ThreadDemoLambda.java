/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ThreadDemo
 * Author:   14172
 * Date:     2020/6/26 8:34
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjean.exercise.exercise01.base.lambda;

/**
 * @author 14172
 * @create 2020/6/26
 * @since 1.0.0
 */
public class ThreadDemoLambda {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
//        m();
        for (int i = 0; i < 10000; i++) {
            m();
        }
        System.out.println(System.currentTimeMillis()-time);
    }
    static void m() {
        new Thread(()->{
//            System.out.println("123");
        }).start();
    }
}
