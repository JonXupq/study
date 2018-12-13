package current.threadPoosExecutor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class run {

    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                0 // int corePoolSize   池中所保存的线程数， 包括空闲线程， 核心池的大小
                ,0 // int maximumPooAize 池中允许的最大线程数
                ,0 // keepAliveTime 当线程数量大于corePoolSize时， 在没有超过指定的时间内不将空闲线程删除, 若=0 完毕后立即删除
                ,TimeUnit.HOURS //TimeUnit 单位
                ,new LinkedBlockingQueue<Runnable>() // workQueue 保持任务的队列

        );

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
    }
}
