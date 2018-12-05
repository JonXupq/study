package current.future;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private int age;

    public MyCallable(int age) {
        this.age = age;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(4000);
        return "返回的年龄 ： "+ age;
    }
}
