package current.Semaphore;

public class ThreadB extends Thread{

    private SemaphoreService service;

    public ThreadB(SemaphoreService service) {
        this.service = service;
    }

    @Override
    public void run() {

        service.sqyHelloLock();
    }
}
