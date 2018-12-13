package current.executorService;

import java.util.concurrent.Callable;

public class MyCallableB2 implements Callable<String> {
    @Override
    public String call() throws Exception {

        System.out.println("mycallableB begin :  " + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {

          if(Thread.currentThread().isInterrupted() == false){

              Math.random();
              Math.random();
              Math.random();
              System.out.println("mycallableB " +(i+1));
          }else {

              System.out.println("++++++++++抛异常+++++++++");
              throw new InterruptedException();
          }
        }

        System.out.println("mycallableB end:  " + System.currentTimeMillis());
        return "return b";
    }
}
