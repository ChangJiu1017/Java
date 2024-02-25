package Parintable.one;

public class PrintableDemo {
    public static void main(String[] args) {

//        //Lambda表达式
//        usePrintable((String s)->{
//            System.out.println(s);
//        });
//        //简化
//        usePrintable(s-> System.out.println(s));
//
//        //方法引用符 ::
//        usePrintable(System.out::println);

        usePrintable((String s)->{
            return Integer.parseInt(s);
        });

        usePrintable(s->Integer.parseInt(s));

        usePrintable(Integer::parseInt);

    }

    public static void usePrintable(Printanle p )
    {
        //p.PrintString("爱生活、爱Java");

        int number = p.PrintString("666");
        System.out.println(number);
    }
}
