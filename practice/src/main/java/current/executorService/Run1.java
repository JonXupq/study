package current.executorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run1 {

    public static void main(String[] args) {

        try {
            ArrayList list= new ArrayList();
            list.add(new MyCallableA());
            list.add(new MyCallableB2());

            ExecutorService executorService = Executors.newCachedThreadPool();
            String o = (String) executorService.invokeAny(list);
            List list1 = executorService.invokeAll(list);
            System.out.println("=============" + o);
            System.out.println("----------------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
