package Lambdas.two;

public class Lamdemo {
    public static void main(String[] args) {

        useInter(() ->{
            System.out.println("111");
        });


        //ʹ��Lambda����Ҫ�нӿڣ�����Ҫ��ӿ������ҽ���һ�����󷽷�

        useInter(()-> System.out.println("111"));

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("�����ڲ���");
            }
        }).start();

        //����������ʹ�û����������Ƶ���lambda���ʽ
        Runnable r = ()-> System.out.println("Lambda���ʽ");

        new Thread(r).start();

        new Thread(()-> System.out.println("LADFFF")).start();

    }

    public static void useInter(Inter i)
    {
        i.show();
    }
}


