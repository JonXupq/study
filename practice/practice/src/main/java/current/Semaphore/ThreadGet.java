package current.Semaphore;

public class ThreadGet extends Thread{

    private RepastService service;

    public ThreadGet(RepastService service) {
        this.service = service;
    }

    @Override
    public void run() {

        service.get();
    }
}
