package current.future;

public class MyRunnable1 implements Runnable{

    private int a;

    public MyRunnable1(int a) {

        this.a = a;
    }

    @Override
    public void run() {

        a = 100;
   }
}
