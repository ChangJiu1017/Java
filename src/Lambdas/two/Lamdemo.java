package Lambdas.two;

public class Lamdemo {
    public static void main(String[] args) {

        useInter(() ->{
            System.out.println("111");
        });


        //使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法

        useInter(()-> System.out.println("111"));

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();

        //必须上下文使用环境，才能推导出lambda表达式
        Runnable r = ()-> System.out.println("Lambda表达式");

        new Thread(r).start();

        new Thread(()-> System.out.println("LADFFF")).start();

    }

    public static void useInter(Inter i)
    {
        i.show();
    }
}


