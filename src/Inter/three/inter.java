package Inter.three;

public interface inter {

    default void show11()
    {
        System.out.println(1);
    }
    default void show12()
    {
        //System.out.println(1);
        show();
        method();

    }

    private void show()
    {
        System.out.println(1);
    }

    private static void  method()
    {
        System.out.println(1);
    }
    static void show13()
    {
        //System.out.println(1);
        method();

    }

    public static void show14()
    {
        System.out.println(1);
    }
}
