package Parintable.one;

public class PrintableDemo {
    public static void main(String[] args) {

//        //Lambda���ʽ
//        usePrintable((String s)->{
//            System.out.println(s);
//        });
//        //��
//        usePrintable(s-> System.out.println(s));
//
//        //�������÷� ::
//        usePrintable(System.out::println);

        usePrintable((String s)->{
            return Integer.parseInt(s);
        });

        usePrintable(s->Integer.parseInt(s));

        usePrintable(Integer::parseInt);

    }

    public static void usePrintable(Printanle p )
    {
        //p.PrintString("�������Java");

        int number = p.PrintString("666");
        System.out.println(number);
    }
}
