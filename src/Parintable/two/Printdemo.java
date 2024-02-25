package Parintable.two;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Printdemo {
    public static void main(String[] args)
    {
        usePrinter((String s)->{
            String result = s.toUpperCase();
            System.out.println(result);
        });

        usePrinter((String s)->{
            System.out.println(s.toUpperCase());
        });

        usePrinter(s -> {
            System.out.println(s.toUpperCase());
        });

        usePrinter(s-> System.out.println(s.toUpperCase()));

        //引用对象的实例方法
        PrintString ps = new PrintString();
        usePrinter(ps::PrintUpper);

        //Lambda表达式被对象的实例方法替代的时候，它的形式参数全部传递给该方法作为参数

    }

    private static void usePrinter(Printinter p)
    {
        p.printUpperCase("HelloWorld");
    }
}
