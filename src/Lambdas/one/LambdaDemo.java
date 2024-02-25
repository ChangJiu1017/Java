package Lambdas.one;

import Lambdas.one.Inter;
import Lambdas.one.Intertwo;

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("Hello World Java");
        useadd((int x,int y)->{
            return x+y;
        });
        //参数的类型可以省略
        useadd((x,y)->{
            return x+y;
        });

        useFlyable((String s)->{
            System.out.println(s);
        });
        //如果参数有且仅有一个 （）可以省略
        useFlyable(s->{
            System.out.println(s);
        });
        //如果代码块的语句只有一条  可以省略大括号和分号
        useFlyable(s-> System.out.println(s));

        //如果有return 要省略return
        //useadd((x,y)-> return x+y);
        useadd((x,y)-> x+y);
    }

    private static void useFlyable(Inter i)
    {
        i.fly("飞鹤日历 清空往里");
    }

    private static void useadd(Intertwo a)
    {
        int sum = a.add(10,20);
        System.out.println(sum);
    }
}
