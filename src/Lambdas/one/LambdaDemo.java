package Lambdas.one;

import Lambdas.one.Inter;
import Lambdas.one.Intertwo;

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("Hello World Java");
        useadd((int x,int y)->{
            return x+y;
        });
        //���������Ϳ���ʡ��
        useadd((x,y)->{
            return x+y;
        });

        useFlyable((String s)->{
            System.out.println(s);
        });
        //����������ҽ���һ�� ��������ʡ��
        useFlyable(s->{
            System.out.println(s);
        });
        //������������ֻ��һ��  ����ʡ�Դ����źͷֺ�
        useFlyable(s-> System.out.println(s));

        //�����return Ҫʡ��return
        //useadd((x,y)-> return x+y);
        useadd((x,y)-> x+y);
    }

    private static void useFlyable(Inter i)
    {
        i.fly("�ɺ����� �������");
    }

    private static void useadd(Intertwo a)
    {
        int sum = a.add(10,20);
        System.out.println(sum);
    }
}
