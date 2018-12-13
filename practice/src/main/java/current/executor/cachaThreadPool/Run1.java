package current.executor.cachaThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run1 {

    public static void main(String[] args) {

        // 无界线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(
                new Runnable() {
                    @Override
                    public void run() {

                        try {
                            System.out.println(" runnable1 begin " +System.currentTimeMillis());
                            Thread.sleep(1000);
                            System.out.println("A");
                            System.out.println(" runnable1 end " +System.currentTimeMillis());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }

        );

        executorService.execute(
                new Runnable() {
                    @Override
                    public void run() {

                        try {
                            System.out.println(" runnable2 begin " +System.currentTimeMillis());
                            Thread.sleep(1000);
                            System.out.println("B");
                            System.out.println(" runnable2 end " +System.currentTimeMillis());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }

        );
    }
}
