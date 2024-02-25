package com.Spring;

import java.io.File;
import java.io.IOException;
//import java.sql.SQLOutput;

public class File_class {
    public static void main(String[] args) throws IOException {
        File f1 =new File("D:\\StudyOrWork\\itcast\\java.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("D:\\StudyOrWork\\itcast\\JavaSE");
        System.out.println(f2.mkdir());
        File f3 = new File("D:\\StudyOrWork\\itcast\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());

        File f4 = new File("D:\\StudyOrWork\\itcast\\Javase.txt");
        System.out.println(f4.createNewFile());
    }
}
