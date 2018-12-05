package current.executor.fixedThreadPool;

import cn.jon.net.redis.current.executor.cachaThreadPool.MyThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run2 {

    public static void main(String[] args) {

        MyThreadFactory myThreadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newFixedThreadPool(3, myThreadFactory);

        Runnable runnable = new Runnable() {

            @Override
            public void run() {

                try {
                    System.out.println("begin运行 " + System.currentTimeMillis() + " name= " + Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println("end运行 " + System.currentTimeMillis() + " name= " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);


    }
}
