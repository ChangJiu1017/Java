package com.Spring;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class File_IO {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream("D:\\StudyOrWork\\itcast\\file_io.txt", true);//追加

//        File file =new File("D:\\StudyOrWork\\itcast\\file_io.txt");
//        FileOutputStream fos2 = new FileOutputStream(file);
//
//        FileOutputStream fos3 = new FileOutputStream(new File("D:\\StudyOrWork\\itcast"));

//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        byte[] bys ={97,98,99,100,101,102};
//        fos.write(bys);
//        byte[] bys1="abcds".getBytes(StandardCharsets.UTF_8);
//        fos.write(bys1,1,3);
            for (int i = 0; i < 10; i++) {
                fos.write("hello".getBytes(StandardCharsets.UTF_8));
                fos.write("\n".getBytes(StandardCharsets.UTF_8));
            }

            //释放资源
            fos.close();
        }catch(IOException e){
            e.getStackTrace();
        }finally {
            if(fos !=null)
            {
                try {
                    fos.close();
                }catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
