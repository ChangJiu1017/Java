package Consumer;

import java.util.function.Consumer;

public class CousumerDemo {
    public static void main(String[] args) {

        operaterString("王许曌",(String s)->{
            System.out.println(s);
        });

        operaterString("林青霞",s-> System.out.println(s));
        operaterString("李青霞",System.out::println);

        operaterString("常鑫宇",s->{
                    System.out.println(new StringBuilder(s).reverse().toString());
                }
        );

        operaterString("changxinyu",s-> System.out.println(new StringBuilder(s).reverse().toString()));

    }

    private static void operaterString(String name, Consumer<String> co){

        co.accept(name);

    }
}
