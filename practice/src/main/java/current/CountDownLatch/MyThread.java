package current.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    private CountDownLatch maxRuner;

    public MyThread(CountDownLatch maxRuner) {
        this.maxRuner = maxRuner;
    }

    @Override
    public void run() {

        try {
            System.out.println( Thread.currentThread().getName() + " 开始");
            Thread.sleep(1000);
            maxRuner.countDown();
            System.out.println( Thread.currentThread().getName() + " 结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
