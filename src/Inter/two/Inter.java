package Inter.two;

public interface Inter extends intettwo{

    void show();

    public default void method()
    {
        System.out.println("inter中的默认方法");

    }

    public static void test()
    {
        System.out.println("inter 中的静态方法");
    }
}
