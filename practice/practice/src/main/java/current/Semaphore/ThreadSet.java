package current.Semaphore;

public class ThreadSet extends Thread{

    private RepastService service;

    public ThreadSet(RepastService service) {
        this.service = service;
    }

    @Override
    public void run() {


        service.set();
    }
}
