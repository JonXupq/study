package current.Semaphore;

public class ServiceMain {

    public static void main(String[] args) {

        RepastService repastService = new RepastService();
        int t= 120;
        ThreadSet[] threadSets = new ThreadSet[t];
        ThreadGet[] threadGets = new ThreadGet[t];

        for (int i = 0; i < t ; i++) {

            threadSets[i] = new ThreadSet(repastService);
            threadSets[i].setName("set " + i);
            threadGets[i] = new ThreadGet(repastService);
            threadGets[i].setName("get " + i);
        }
        for (int i = 0; i < t; i++) {

            threadSets[i].start();
            threadGets[i].start();

        }


    }
}
