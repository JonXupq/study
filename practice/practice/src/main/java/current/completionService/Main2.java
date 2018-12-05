package current.completionService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

    public static void main(String[] args) {

        try {

            ExecutorService executorService = Executors.newCachedThreadPool();
            ExecutorCompletionService objectExecutorCompletionService = new ExecutorCompletionService(executorService);

            for (int i = 0; i < 10; i++) {

                objectExecutorCompletionService.submit(new Callable<String>() {
                    @Override
                    public String call() throws Exception{

                        int sleepValue = (int) (Math.random() * 1000);
                        System.out.println("sleep = " + sleepValue + " - " + Thread.currentThread().getName());
                        Thread.sleep(sleepValue);
                        return "sleep = " + sleepValue + " -=- " + Thread.currentThread().getName();
                    }
                });
            }

            for (int i = 0; i < 10; i++) {

                System.out.println(objectExecutorCompletionService.take().get());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
