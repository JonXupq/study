package current.future;

import java.util.concurrent.*;

public class Main1 {

    public static void main(String[] args) {

        try {
            MyCallable myCallable = new MyCallable(100);

            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

            Future<String> submit = threadPoolExecutor.submit(myCallable);
            System.out.println("main A " + System.currentTimeMillis());
            System.out.println(submit.get());
            System.out.println("main A  end " + System.currentTimeMillis());


            ExecutorCompletionService service = new ExecutorCompletionService<>(threadPoolExecutor);
            service.submit(myCallable);
            System.out.println("main A " + System.currentTimeMillis());
            System.out.println(service.take().get());
            System.out.println("main A  end " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
