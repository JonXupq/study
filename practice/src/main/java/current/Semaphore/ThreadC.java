package current.Semaphore;

public class ThreadC extends Thread{


    private SemaphoreService service;
    private SemaphoreListPool listPool;

    public ThreadC(SemaphoreListPool listPool) {
        this.listPool = listPool;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5 ; i++) {

            String s = listPool.get();
            System.out.println(Thread.currentThread().getName() + " 取得值 " + s);
            listPool.put(s);

        }
    }

}
