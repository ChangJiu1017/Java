package Inter.two;

public interface Inter extends intettwo{

    void show();

    public default void method()
    {
        System.out.println("inter�е�Ĭ�Ϸ���");

    }

    public static void test()
    {
        System.out.println("inter �еľ�̬����");
    }
}
