package Lambdas.three;

//�����ڲ���
public class LambdaDemo {

    public static void main(String[] args) {
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("�ӿ�");
            }
        });

        useAniumal(new menth(){
            @Override
            public void math() {
                System.out.println("������");
            }
        });

        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("������");
            }
        });

        //Lambdaֻ�ܵ��ýӿں�����
        useInter(()-> System.out.println("�ӿ�"));
    }

    private static void useStudent(Student s)
    {
        s.study();
    }

    private static void useAniumal(menth a)
    {
        a.math();
    }

    private static void useInter(Inter i)
    {
        i.show();
    }

}
