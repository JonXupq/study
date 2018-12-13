package current.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test2 {

    public static void main(String[] args) {

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> taskA = pool.submit(new MyRecursiveTask2());
        ForkJoinTask<Integer> taskB = pool.submit(new MyRecursiveTask21());
        System.out.println("准备打印 ： "+ System.currentTimeMillis());
        System.out.println(taskA.join() + " a: " + System.currentTimeMillis());
        System.out.println(taskB.join() + " c: " + System.currentTimeMillis());

    }
}
