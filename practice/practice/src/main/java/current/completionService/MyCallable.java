package current.completionService;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private String name;
    private long sleepValue;

    public MyCallable(String name, long sleepValue) {

        this.name = name;
        this.sleepValue = sleepValue;
    }

    @Override
    public String call() throws Exception {

        System.out.println(name);
//        Thread.sleep(10000);
        Thread.sleep(sleepValue);
        return "return " + name;
    }
}
