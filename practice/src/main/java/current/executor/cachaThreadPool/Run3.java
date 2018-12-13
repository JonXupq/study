package current.executor.cachaThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run3 {

    public static void main(String[] args) {

        // 定制线程factory
        MyThreadFactory myThreadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newCachedThreadPool(myThreadFactory);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(" 运行中 "+System.currentTimeMillis() + " " + Thread.currentThread().getName());
            }
        });
    }
}
