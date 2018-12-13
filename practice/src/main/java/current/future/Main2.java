package current.future;

import java.util.concurrent.*;

public class Main2 {

    public static void main(String[] args) {

        try {
            Runnable runnable = new Runnable() {

                @Override
                public void run() {

                    System.out.println("打印信息 runnable");
                }
            };

            Callable<String> callable = new Callable<String>() {

                @Override
                public String call() {

                    System.out.println("打印信息 callable");
                    return "callable";
                }
            };
            ExecutorService executorService = Executors.newCachedThreadPool();
            Future<?> submit = executorService.submit(runnable);
            System.out.println(submit.get() + "------" + submit.isDone() + "------" + submit.isCancelled());
            Future<?> submit1 = executorService.submit(callable);
            System.out.println(submit1.get() + "------" + submit1.isDone() + "------" + submit1.isCancelled());


            UseInfo useInfo = new UseInfo();
            MyRunnable myRunnable = new MyRunnable(useInfo);
            Future<UseInfo> submit2 = executorService.submit(myRunnable, useInfo);
            useInfo = submit2.get();
            System.out.println(useInfo.toString() + "------" + submit2.isDone() + "------" + submit2.isCancelled());


            int a=0;
            MyRunnable1 myRunnable1 = new MyRunnable1(a);
            Future<Integer> submit3 = executorService.submit(myRunnable1, a);
            a = submit3.get();
            System.out.println(submit3.get() + "------" + submit3.isDone() + "------" + submit3.isCancelled());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
