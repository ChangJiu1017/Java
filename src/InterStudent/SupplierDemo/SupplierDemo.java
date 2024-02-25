package InterStudent.SupplierDemo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        String s= getString(()->"����ϼ");
        System.out.println(s);

        int a =getInteger(()->13);
        System.out.println(a);

    }

    //����һ��int����
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }

    //����һ��String
    private static String getString(Supplier<String> sup){
        return sup.get();
    }
}
