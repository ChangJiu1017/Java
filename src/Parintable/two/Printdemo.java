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

        //���ö����ʵ������
        PrintString ps = new PrintString();
        usePrinter(ps::PrintUpper);

        //Lambda���ʽ�������ʵ�����������ʱ��������ʽ����ȫ�����ݸ��÷�����Ϊ����

    }

    private static void usePrinter(Printinter p)
    {
        p.printUpperCase("HelloWorld");
    }
}
