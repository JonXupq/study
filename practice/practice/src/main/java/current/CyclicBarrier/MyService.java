package current.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyService {

    private CyclicBarrier cyclicBarrier;

    public MyService(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void beginRun(){

        try {
            Thread.sleep((int)(Math.random()*1000));
            System.out.println(Thread.currentThread().getName()+ " " + System.currentTimeMillis() + " begin开始1阶段 " + (cyclicBarrier.getNumberWaiting()+1)  );
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName()+ " " + System.currentTimeMillis() + " end结束1阶段 " + (cyclicBarrier.getNumberWaiting()+1 ) );

            Thread.sleep((int)(Math.random()*1000));
            System.out.println(Thread.currentThread().getName()+ " " + System.currentTimeMillis() + " begin开始2阶段 " + (cyclicBarrier.getNumberWaiting()+1 ) );
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName()+ " " + System.currentTimeMillis() + " end结束2阶段 " + (cyclicBarrier.getNumberWaiting()+1 ) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
