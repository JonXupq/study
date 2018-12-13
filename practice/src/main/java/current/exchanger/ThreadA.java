package current.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadA extends Thread{

    private Exchanger<String> exchanger;

    public ThreadA(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {

        try {
            System.out.println("a begin");
            try {
                System.out.println("在线程A中得到线程B的值 = " + exchanger.exchange("数据 exchange A",5, TimeUnit.MICROSECONDS));
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
            System.out.println("a end");

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
