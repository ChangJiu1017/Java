package Tread;

public class SellTicket implements Runnable {
    //private int tickets=100;
    private static int tickets=100;
    private Object obj =new Object();
    int x=0;

    public void run()
    {
        while(true) {
            if (x % 2 == 0) {
                synchronized (SellTicket.class) {
                //synchronized (this){
                //synchronized (obj) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出票" + tickets + "张票");
                        tickets--;
                    }
                }
            }else{
//                synchronized (obj) {
//                    if (tickets > 0) {
//                        try {
//                            Thread.sleep(100);
//
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出票" + tickets + "张票");
//                        tickets--;
//                    }
//                }
                sellTicket();


            }
            x++;
        }
    }
            public static synchronized void sellTicket(){
                if(tickets>0){
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在出票"+tickets+"张票");
                    tickets--;

        }
    }
}
