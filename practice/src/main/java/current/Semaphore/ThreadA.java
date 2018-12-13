package current.Semaphore;

public class ThreadA extends Thread {

    private SemaphoreService service;

    public ThreadA(SemaphoreService service) {
        this.service = service;
    }

    @Override
    public void run() {

        service.sqyHelloLock();
    }
}
