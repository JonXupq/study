package current.executor.fixedThreadPool;

public class MyRunnable1 implements Runnable {

    private String name;

    public MyRunnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " name = " +name + "begin :" + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " name = " +name + "end :" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
