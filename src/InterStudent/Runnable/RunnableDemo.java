package InterStudent.Runnable;

public class RunnableDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动");

            }
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了2"));

    }

    private static void startThread(Runnable r)
    {
        new Thread(r).start();
    }
}
