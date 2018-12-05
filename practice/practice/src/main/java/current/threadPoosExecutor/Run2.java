package current.threadPoosExecutor;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run2 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {

                try {
                    System.out.println(Thread.currentThread().getName() + " run ! time: -- " + System.currentTimeMillis());

                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        try {
            ThreadPoolExecutor threadPoolExecutor =
                    new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());

            threadPoolExecutor.execute(runnable);
            threadPoolExecutor.execute(runnable);
            threadPoolExecutor.execute(runnable);
            threadPoolExecutor.execute(runnable);
            threadPoolExecutor.execute(runnable);
            threadPoolExecutor.execute(runnable);
            threadPoolExecutor.execute(runnable);
            threadPoolExecutor.execute(runnable);
//            threadPoolExecutor.execute(runnable);
//            threadPoolExecutor.execute(runnable);
            Thread.sleep(1000);

            System.out.println(" A; " + threadPoolExecutor.getCorePoolSize());
            System.out.println(" A; " + threadPoolExecutor.getPoolSize());
            System.out.println(" A; " + threadPoolExecutor.getMaximumPoolSize());
            System.out.println(" A; " + threadPoolExecutor.getQueue().size());

            Thread.sleep(10000);

            System.out.println(" A; " + threadPoolExecutor.getCorePoolSize());
            System.out.println(" A; " + threadPoolExecutor.getPoolSize());
            System.out.println(" A; " + threadPoolExecutor.getMaximumPoolSize());
            System.out.println(" A; " + threadPoolExecutor.getQueue().size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
