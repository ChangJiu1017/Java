package InterStudent.Runnable;

public class RunnableDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"�߳�����");

            }
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"�߳�������2"));

    }

    private static void startThread(Runnable r)
    {
        new Thread(r).start();
    }
}
