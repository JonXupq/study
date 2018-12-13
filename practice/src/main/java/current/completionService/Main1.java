package current.completionService;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Main1 {

    public static void main(String[] args) {

        try {
            MyCallable username1 = new MyCallable("username1", 5000);
            MyCallable username2 = new MyCallable("username2", 4000);
            MyCallable username3 = new MyCallable("username3", 3000);
            MyCallable username4 = new MyCallable("username4", 2000);
            MyCallable username5 = new MyCallable("username5", 1000);

            ArrayList<Callable> callables = new ArrayList<>();
            callables.add(username1);
            callables.add(username2);
            callables.add(username3);
            callables.add(username4);
            callables.add(username5);

            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

            ExecutorCompletionService executorCompletionService = new ExecutorCompletionService<>(threadPoolExecutor);

            for (int i = 0; i < 5; i++) {

                executorCompletionService.submit(callables.get(i));
            }

            for (int i = 0; i < 8; i++) {

                System.out.println("等待" + (i+1) +" 返回值");
                System.out.println(executorCompletionService.take().get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
