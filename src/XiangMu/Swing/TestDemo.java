package XiangMu.Swing;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("�������������");
        int n = in.nextInt();
        System.out.printf("%d\n",n);
        System.out.println("��������");
        String s = in.nextLine();
        System.out.println(s);

        ArrayList array = new ArrayList<>();

        array.add("a");
        array.add("b");
        array.add("c");

        array.add(10);
        array.add(20);
        array.add(30);

        array.add(4,15);
        System.out.println(array);
        System.out.println(array.size());

        int [] a = {1,2,4,5,6,7,8,9,0};
        for (int b : a)
        {
            System.out.println(b);
        }
    }
}
