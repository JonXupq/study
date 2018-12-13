package current.forkjoin;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask2 extends RecursiveTask<Integer>

{
    @Override
    protected Integer compute() {

        try {
            System.out.println(Thread.currentThread().getName() + "begin A " + System.currentTimeMillis());

            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "end A " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  100;
    }
}
