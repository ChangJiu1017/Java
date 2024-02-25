package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
            //创建对象
            call phone=new call();

            //使用成员变量
            System.out.println(phone.brand);
            System.out.println(phone.price);
            phone.brand="54";
            phone.price=299;

            System.out.println(phone.brand);
            System.out.println(phone.price);
            phone.call();
            phone.sendMessage();
            call();
            send();

            Person person=new Person();

            person.setAge(1);
            System.out.println(person.getAge());

    }

    public static void call()
    {
        System.out.println("你好 static call");
    }

    public static void send()
    {
        System.out.println("send");


    }

}

