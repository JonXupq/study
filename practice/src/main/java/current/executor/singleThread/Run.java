package current.executor.singleThread;

import cn.jon.net.redis.current.executor.cachaThreadPool.MyThreadFactory;
import cn.jon.net.redis.current.executor.fixedThreadPool.MyRunnable1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

    public static void main(String[] args) {


//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        for (int i = 0; i < 4; i++) {
//
//            executorService.execute(new MyRunnable1((i+1+"")));
//
//        }


        MyThreadFactory myThreadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newSingleThreadExecutor(myThreadFactory);

        for (int i = 0; i < 4; i++) {

            executorService.execute(new MyRunnable1((i+1+"")));

        }

    }
}
