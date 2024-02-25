package Consumer;

import java.util.function.Consumer;

public class CousumerDemo {
    public static void main(String[] args) {

        operaterString("�����",(String s)->{
            System.out.println(s);
        });

        operaterString("����ϼ",s-> System.out.println(s));
        operaterString("����ϼ",System.out::println);

        operaterString("������",s->{
                    System.out.println(new StringBuilder(s).reverse().toString());
                }
        );

        operaterString("changxinyu",s-> System.out.println(new StringBuilder(s).reverse().toString()));

    }

    private static void operaterString(String name, Consumer<String> co){

        co.accept(name);

    }
}
