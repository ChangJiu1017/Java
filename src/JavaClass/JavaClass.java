package JavaClass;

import java.util.function.Consumer;





public class JavaClass {

    // ð�ݺ���
    public static void BubbleSort(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    // ѡ����

    public static void SelectSort(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = i;
            int min = arr[i];
            for(int j = i + 1; j < arr.length; j++)
            {
                if(min > arr[j])
                {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }


    // ���̺߳���,ʹ��һ���̵߳�����һ���߳̽����̼߳�ͨ��






    public static void ThreadTest()
    {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Thread");
            }
        });
        thread.start();
    }


    // дһ���������ڵ�ת����

    public static void Reverse(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length / 2; i++)
        {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // дһ���������ڴ�ӡ����

    public static void PrintArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    // дһ�����������ڽ��滭ͼ

    public static void Draw()
    {
        System.out.println("Hello Draw");
    }

    // дһ���������Խ��зֲ�ʽ�ĵ���

    public static void Distributed()
    {
        System.out.println("Hello Distributed");
    }




    public static int copilot()
    {
        System.out.println("Hello Copilot");

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Hello Java Class");
        JavaInterface Interface = new JavaInterface();
        int abc = Interface.InterfaceOne(100);
        System.out.println(abc);
        InterfaceTest InterfaceA = new InterfaceTest() {
            @Override
            public void CouTestName() {
                InterfaceTest.super.CouTestName();
                System.out.println("ABC");
            }
        };
        InterfaceA.CouTestName();

        copilot();
    }
}











