package current.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test1 {

    public static void main(String[] args) {

        try {
            MyRecursiveTask1 task1 = new MyRecursiveTask1();
            System.out.println(task1.hashCode());

            ForkJoinPool pool = new ForkJoinPool();
            ForkJoinTask<Integer> task2 = pool.submit(task1);
//            System.out.println(task2.hashCode()+ "---------" + task2.get());
            System.out.println(task2.hashCode()+ "---------" + task2.join());
        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
