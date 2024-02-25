package InterStudent.myinter;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my =() -> System.out.println("函数式接口");
        my.show();

    }
}
