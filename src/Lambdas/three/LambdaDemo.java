package Lambdas.three;

//匿名内部类
public class LambdaDemo {

    public static void main(String[] args) {
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        useAniumal(new menth(){
            @Override
            public void math() {
                System.out.println("抽象类");
            }
        });

        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });

        //Lambda只能调用接口函数；
        useInter(()-> System.out.println("接口"));
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
