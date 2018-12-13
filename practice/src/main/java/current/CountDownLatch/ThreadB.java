package current.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class ThreadB extends Thread {

    private CountDownLatch downLatch;

    public ThreadB(CountDownLatch downLatch) {
        this.downLatch = downLatch;
    }

    @Override
    public void run() {


        try {

            System.out.println( Thread.currentThread().getName() + " 开始");
            Thread.sleep(5000);
            downLatch.countDown();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
