package com.Spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered {
    public static void main(String[] args) throws IOException {
        //键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串：");
        String line= br.readLine();
        System.out.println("你输入的字符串是："+line);

        System.out.println("请输入一个整数");
        int i =Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是"+i);
        System.out.println("你好啊");

    }


}
