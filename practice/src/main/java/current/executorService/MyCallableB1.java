package current.executorService;

import java.util.concurrent.Callable;

public class MyCallableB1 implements Callable<String> {

    @Override
    public String call() throws Exception {

        System.out.println("mycallableB begin :  " + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {

            Math.random();
            Math.random();
            Math.random();
            System.out.println("mycallableB " +(i+1));
        }

        System.out.println("mycallableB end:  " + System.currentTimeMillis());
        return "return b";
    }
}
