package Reflect;

public class Student {

    //��Ա����
    private String name; //˽��
    int age;   //Ĭ��
    public String address; //����

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

    //���췽��
    private Student(String name)  //˽�з���
    {
        this.name = name;
    }

    Student(String address,int age) //Ĭ�Ϸ���
    {
        this.address = address;
        this.age = age;
    }

    public Student(String name ,int age ,String address) //��������
    {
        this.name= name;
        this.age = age ;
        this.address = address;
    }
    public Student() //�������� �޲�
    {

    }
}
