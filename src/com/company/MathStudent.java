package com.company;

import java.util.Scanner;

public class MathStudent {
    public static void main(String[] args) {
        double x = 4;
        double y;
        double a = 60;
        double b;
        int n = 2;
        int m = 4;
        int l = n* ++m;
        var ab = 2;
        y = Math.sqrt(x);
        b = Math.sin(a);
        Scanner in = new Scanner(System.in);


        do{
             m = in.nextInt();
            System.out.println(y);
            System.out.println(b);
            System.out.println(m);
            System.out.println(l);
            System.out.println(ab);

        }while(true);

    }

}
