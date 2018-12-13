package current.executorService;

import java.util.concurrent.Callable;

public class MyCallableA implements Callable<String> {
    @Override
    public String call() throws Exception {

        System.out.println("mycallableA begin :  " + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {

            Math.random();
            Math.random();
            Math.random();
            System.out.println("mycallableA " +(i+1));
        }

        System.out.println("mycallableA end:  " + System.currentTimeMillis());
        return "return a";
    }
}
