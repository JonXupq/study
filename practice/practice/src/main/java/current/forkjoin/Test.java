package current.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class Test {

    public static void main(String[] args) {

        try {
            ForkJoinPool pool = new ForkJoinPool();
            System.out.println(System.currentTimeMillis());
            pool.submit(new MyRecursiveAction(1,10));
            Thread.sleep(5000);
            System.out.println(System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
