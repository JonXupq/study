package current.CountDownLatch;

public class ThreadA implements Runnable {

    private MyService service;

    public ThreadA(MyService service) {

        this.service = service;
    }

    @Override
    public void run() {

        service.testMethod01();
    }
}
