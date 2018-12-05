package current.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {

//        CyclicBarrier cbRef = new CyclicBarrier(2, new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("全到了！");
//            }
//        });
//
//        Thread[] threads = new Thread[5];
//        for (int i = 0; i < threads.length; i++) {
//
//            threads[i] = new ThreadA(cbRef);
//        }
//
//        for (int i = 0; i < threads.length; i++) {
//
//            threads[i].start();
//        }


//        CyclicBarrier cbRef = new CyclicBarrier(3);
//
//        try {
//            ThreadA t1 = new ThreadA(cbRef);
//            t1.start();
//            Thread.sleep(5000);
//            System.out.println(cbRef.getNumberWaiting());
//
//            ThreadA t2 = new ThreadA(cbRef);
//            t2.start();
//            Thread.sleep(5000);
//            System.out.println(cbRef.getNumberWaiting());
//
//            ThreadA t3 = new ThreadA(cbRef);
//            t3.start();
//            Thread.sleep(5000);
//            System.out.println(cbRef.getNumberWaiting());
//
//            ThreadA t4 = new ThreadA(cbRef);
//            t4.start();
//            Thread.sleep(5000);
//            System.out.println(cbRef.getNumberWaiting());
//
//            ThreadA t5 = new ThreadA(cbRef);
//            t5.start();
//            Thread.sleep(5000);
//            System.out.println(cbRef.getNumberWaiting());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        CyclicBarrier cyclicBarrier = new CyclicBarrier(9);
        MyService myService = new MyService(cyclicBarrier);

        Thread[] threads = new Thread[9];
        for (int i = 0; i < threads.length; i++) {

            threads[i] = new ThreadB(myService);
            threads[i].start();
        }

    }
}
