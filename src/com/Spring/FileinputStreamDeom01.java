package com.Spring;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.sql.SQLOutput;

public class FileinputStreamDeom01 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\StudyOrWork\\itcast\\file_io.txt");
        int by =fis.read();
        System.out.println(by);
        System.out.println((char)by);

        by =fis.read();
        System.out.println(by);
        System.out.println((char)by);

        byte[] bys =new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1)
            System.out.print(new String(bys,0,len));

        fis.close();


    }
}
