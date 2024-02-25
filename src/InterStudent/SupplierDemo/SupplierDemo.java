package InterStudent.SupplierDemo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        String s= getString(()->"林青霞");
        System.out.println(s);

        int a =getInteger(()->13);
        System.out.println(a);

    }

    //返回一个int数组
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }

    //返回一个String
    private static String getString(Supplier<String> sup){
        return sup.get();
    }
}
