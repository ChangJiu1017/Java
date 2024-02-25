package com.Spring;

public class String_one {
    public static void main(String[] args)
    {
//        String s1 =new String();
//        System.out.println("s1"+s1);
//
//        char[] chs={'a','b','c'};
//        String s2 =new String(chs);
//        System.out.println("s2"+s2);
//
//        byte[] bys={97,98,99};
//        String s3=new String(bys);
//        System.out.println("s3"+s3);
//
//        String s4="abc";
//        System.out.println("s4"+s4);
//
//        StringBuilder sb=new StringBuilder();
//        sb.append("hello");
//        sb.append("java");
//
//        System.out.println(sb);
//        sb.append("ds").append("jk");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);

        int number=100;
        String s1 =""+number;
        System.out.println(s1);

        String s2=String.valueOf(number);
        System.out.println(s2);
        String s3="100";
        Integer i = Integer.valueOf(s3);
        int x=i.intValue();
        System.out.println(x);

        int y=Integer.parseInt(s3);
        System.out.println((y));

    }
}
