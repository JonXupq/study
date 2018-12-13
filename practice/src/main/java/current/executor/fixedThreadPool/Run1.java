package current.executor.fixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run1 {

    public static void main(String[] args) {

        // 有界线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 3; i++) {

            executorService.execute(new MyRunnable1((i+1)+""));

        }

        for (int i = 0; i < 3; i++) {

            executorService.execute(new MyRunnable1((i+1)+""));

        }
    }
    
}
