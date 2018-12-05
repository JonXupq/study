package current.Semaphore;

public class Main {

    public static void main(String[] args) {

        try {
            SemaphoreService semaphoreService = new SemaphoreService();
//            semaphoreService.testMethod03();
//            ThreadA threadA = new ThreadA(semaphoreService);
//            threadA.setName("A");
//            threadA.start();
//
//            ThreadB threadB= new ThreadB(semaphoreService);
//            threadB.setName("B");
//            threadB.start();
//            Thread.sleep(100);
//            threadB.interrupt();
//            System.out.println("main 中断了 a");
//            ThreadC threadC = new ThreadC(semaphoreService);
//            threadC.setName("C");
//            threadC.start();

//            ThreadB threadB = new ThreadB(semaphoreService);
//            threadB.setName("B");
//            threadB.start();

            ThreadA[] threadAS = new ThreadA[9];
            for (int i = 0;i <9;i++  ) {
                threadAS[i] = new ThreadA(semaphoreService);
//                threadAS[i].setName("A" + (i));
//                ThreadB threadB= new ThreadB(semaphoreService);
//                threadB.setName("B");
//                ThreadC threadC = new ThreadC(semaphoreService);
//                threadC.setName("C");
                threadAS[i].start();
//                threadB.start();
//                threadC.start();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }



//        try {
//            Semaphore semaphore = new Semaphore(5);
//            semaphore.acquire();
//            semaphore.acquire();
//            semaphore.acquire();
//            System.out.println(semaphore.availablePermits());
//            semaphore.acquire();
//            semaphore.acquire();
//
//
//            semaphore.release();
//            System.out.println(semaphore.availablePermits());
//            semaphore.release(10);
//            System.out.println(semaphore.availablePermits());
//            semaphore.acquire();
//            semaphore.acquire();
//            semaphore.acquire();
//            semaphore.acquire();
//            semaphore.acquire();
//            semaphore.acquire();
//            System.out.println(semaphore.availablePermits());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}

