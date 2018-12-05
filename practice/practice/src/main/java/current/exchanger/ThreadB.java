package current.exchanger;

import java.util.concurrent.Exchanger;

public class ThreadB implements Runnable{

    private Exchanger<String> exchanger;

    public ThreadB(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("b begin");
            System.out.println("在线程b中得到线程A的值 = " + exchanger.exchange("数据 exchange B"));
            System.out.println("b end");

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
