package current.CountDownLatch;

public class Main {

    public static void main(String[] args) {

//线程堵塞
        try {
            MyService myService = new MyService();

            ThreadA threadA = new ThreadA(myService);
            Thread thread = new Thread(threadA);

            thread.start();
            Thread.sleep(5000);
            myService.downMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        所有线程结束后主线结束堵塞
//        try {
//
//            CountDownLatch countDownLatch = new CountDownLatch(10);
//
//            Thread[] threads = new Thread[(int)countDownLatch.getCount()];
//            for (int i = 0; i < threads.length; i++) {
//
//                threads[i] = new cn.jon.net.redis.current.CountDownLatch.ThreadB(countDownLatch);
//                threads[i].setName("线程 " + i);
//                threads[i].start();
//            }
//            countDownLatch.await();
//            System.out.println("开始");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        CountDownLatch maxRuner = new CountDownLatch(10);
//        Thread[] tArray = new Thread[(int) maxRuner.getCount()];
//
//        for (int i = 0; i < tArray.length; i++) {
//            tArray[i] = new MyThread(maxRuner);
//            tArray[i].setName("线程 "+ (i+1));
//            tArray[i].start();
//        }
//
//        try {
//            maxRuner.await();
//            System.out.println("都回来了");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }
}
