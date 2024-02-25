package Reflect;

public class Student {

    //成员变量
    private String name; //私有
    int age;   //默认
    public String address; //公共

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //构造方法
    private Student(String name)  //私有方法
    {
        this.name = name;
    }

    Student(String address,int age) //默认方法
    {
        this.address = address;
        this.age = age;
    }

    public Student(String name ,int age ,String address) //公共方法
    {
        this.name= name;
        this.age = age ;
        this.address = address;
    }
    public Student() //公共方法 无参
    {

    }
}
