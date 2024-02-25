package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args)
    {
        //创建集合对象  存储学生对象
        ArrayList<Student> array = new ArrayList<Student>();
        while(true) {
            System.out.println("----------欢迎来到学生管理系统-----------");
            System.out.println("1 addtion student");
            System.out.println("2 delete student");
            System.out.println("3 uptate student");
            System.out.println("4 look all student");
            System.out.println("5 exit");
            System.out.println("plese your choose");

            //用Scanner实现键盘输入
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("addtion student");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("delete student");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("update student");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("look all student");
                    findAllstudent(array);
                    break;
                case "5":
                    System.out.println("Thank use");
                    System.exit(0);
                    break;

            }
        }

    }
    //定义一个方法用于添加学生类
    public static void addStudent(ArrayList<Student> array)
    {
        Scanner sc = new Scanner(System.in);
        String sid;
        while(true)
        {
            System.out.println("plese insert student ID");
            sid=sc.nextLine();
            boolean flag=isUsed(array,sid);
            if(flag)
            {
                System.out.println("USED");
            }
            else {
                break;
            }

        }


        System.out.println("plese insert student name");
        String name = sc.nextLine();
        System.out.println("plese insert student age");
        String age = sc.nextLine();
        System.out.println("plese insert student address");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("addton student success");




    }
    //定义一个方法、用于查看学生信息
    public static void findAllstudent(ArrayList<Student> array)
    {
        if(array.size() == 0)
        {
            System.out.println("no information plese addtion and select");
            return;
        }
        System.out.println("ID\t\tname\t\tage\t\taddress");

        for(int i=0;i<array.size();i++)
        {
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }

    }

    public static void deleteStudent(ArrayList<Student> array){

        Scanner sc =new Scanner(System.in);
        String sid=sc.nextLine();
        int index=-1;

        for(int i=0;i<array.size();i++)
        {
            Student s= array.get(i);
            if(s.getSid().equals(sid)){
                index=i;
                //array.remove(i);
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("0");
        }
        else {
            array.remove(index);
        }
        System.out.println("delete student success");
    }

    public static void updateStudent(ArrayList<Student> array){

        Scanner sc = new Scanner(System.in);
        System.out.println("Plese insert your student ID");
        System.out.println("plese insert student ID");
        String sid = sc.nextLine();
        System.out.println("plese insert student name");
        String name = sc.nextLine();
        System.out.println("plese insert student age");
        String age = sc.nextLine();
        System.out.println("plese insert student address");
        String address = sc.nextLine();
        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        for(int i=0;i<array.size();i++)
        {
            Student student =array.get(i);
            if(student.getSid().equals(sid))
            {
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改成功");

    }

    public static boolean isUsed(ArrayList<Student> array,String sid){
        boolean flag = false;
        for(int i=0;i<array.size();i++)
        {
            Student s= array.get(i);
            if(s.getSid().equals(sid))
            {
                flag=true;
            }
        }


        return flag;

    }


}


