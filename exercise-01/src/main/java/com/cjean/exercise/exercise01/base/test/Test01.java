package com.cjean.exercise.exercise01.base.test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {


    public static void main(String[] args) {


        List<String> codeStr = new ArrayList<>();
        int mark = 0;

        for (int i = 0; i < 126; i++) {
            codeStr.add("add...: " + i);
        }

        String code = "";
        for (int i = 0; i < codeStr.size(); i++) {
            code += codeStr.get(i);

            // 大于32的情况
            if (codeStr.size() >= 32) {
                // 被32整除的情况
                if (codeStr.size() % 32 == 0) {
                    if ((i + 1) % 32 == 0) {
                        // 说明是32个，发送一次命令
                        System.out.println("总数超过32，总数是32的倍数.........");
                        // 清空code，准备下一次
                        code = "";
                    }
                } else {

                    //获取不足32个数。开始装填数据的数组下标位置
                    if (0 == mark) {
                        mark = codeStr.size() / 32 * 32;
                    }

                    // 不能被32整除的情况
                    if (i == mark) {
                        // 最后一次发送
                        System.out.println("总数超过32，不满32个发一次........."+(codeStr.size()-i));
                        // 清空code，准备下一次
                        code = "";
                    } else {
                        if ((i + 1) % 32 == 0) {
                            System.out.println("总数超过32，装满32个发一次.........");
                            // 清空code，准备下一次
                            code = "";
                        }
                    }
                }
            } else {
                // 小于32 的情况
                if (i == (codeStr.size() - 1))
                    System.out.println("总数 不到 32，发一次.........");
            }
        }
    }
}
