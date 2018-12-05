package current.forkjoin;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask1 extends RecursiveTask<Integer> {


    @Override
    protected Integer compute() {
        System.out.println("compute time = " +System.currentTimeMillis());
        int a = 1/0;
        return 1000;
    }
}
