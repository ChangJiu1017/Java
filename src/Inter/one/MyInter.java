package Inter.one;

public interface MyInter {
    void show1();

    void show2();

    //void show3();

    public default void show4()
    {
        System.out.println("show4");
    }
}
