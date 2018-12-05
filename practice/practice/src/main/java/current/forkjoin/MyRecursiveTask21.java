package current.forkjoin;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask21 extends RecursiveTask<Integer> {
    @Override
    protected Integer compute() {
        try {
            System.out.println(Thread.currentThread().getName() + "begin C " + System.currentTimeMillis());

            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "end C " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  100;
    }
}
