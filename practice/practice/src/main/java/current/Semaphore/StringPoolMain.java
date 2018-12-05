package current.Semaphore;

public class StringPoolMain {

    public static void main(String[] args) {

        SemaphoreListPool semaphoreListPool = new SemaphoreListPool();

        ThreadC[] threadCS = new ThreadC[3];

        for (int i = 0; i < threadCS.length ; i++) {

            threadCS[i] = new ThreadC(semaphoreListPool);
            threadCS[i].start();
        }

        for (int i = 0; i < threadCS.length; i++) {


        }
    }
}
