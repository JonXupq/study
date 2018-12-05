package current.Semaphore;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.stereotype.Service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class SemaphoreService {

    private boolean isFair = false;
    private Semaphore semaphore = new Semaphore(3, isFair);
    private ReentrantLock reentrantLock = new ReentrantLock();

    public void testMethod01(){

        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()
                        + "  begin timer = " + System.currentTimeMillis());
            System.out.println(Thread.currentThread().getName()
                    + "  sleep 5 s" );
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()
                    + "  end timer = " + System.currentTimeMillis());
            semaphore.release(1);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void testMethod02(){


        try {
            semaphore.acquire();
//            semaphore.acquireUninterruptibly(); // 等待执行acquire的方法不能被中断
            System.out.println(Thread.currentThread().getName() + "  begin timer = " + System.currentTimeMillis());
            for (int i=0; i < Integer.MAX_VALUE; i++){

                String string = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName()
                    + "  end timer = " + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void testMethod03(){

        try {

            System.out.println(semaphore.availablePermits());
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " --- " +semaphore.availablePermits());
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " --- " +semaphore.availablePermits());
            semaphore.release();
            semaphore.release();
            semaphore.release();semaphore.release();semaphore.release();
            semaphore.acquire();
            System.out.println(semaphore.drainPermits() + " --- " +semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " --- " +semaphore.availablePermits());
        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {

            semaphore.release();
        }

    }

    public void testMethod04(){

        try {
            semaphore.acquire();
            Thread.sleep(5000);
            System.out.println("大约还有" + semaphore.getQueueLength() + "线程在等待");
            System.out.println("是否还有线程正在等待信号量? " + semaphore.hasQueuedThreads());
        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {

            semaphore.release();
        }
    }

    public void testMethod05(){

        try {

            semaphore.acquire();
            System.out.println(" ThreadName = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {

            e.printStackTrace();
        }finally {

            semaphore.release();
        }
    }

    public void sqyHello(){

        try {
            semaphore.acquire();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " 准备");
            System.out.println("begin hello " + System.currentTimeMillis() + "ThreadName = " + Thread.currentThread().getName() );
            for (int i = 0; i < 5; i++) {

                System.out.println(Thread.currentThread().getName() + " 打印 " + (i+1));
            }
            System.out.println("end hello " + System.currentTimeMillis());
            semaphore.release();
            System.out.println(" ThreadName = " + Thread.currentThread().getName() + " 结束" + "ThreadName = " + Thread.currentThread().getName() );
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public void sqyHelloLock(){


        try {
            semaphore.acquire();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " 准备");
            reentrantLock.lock();
            System.out.println("begin hello " + System.currentTimeMillis() + " 开始 ThreadName = " + Thread.currentThread().getName() );
            for (int i = 0; i < 5; i++) {

                System.out.println(Thread.currentThread().getName() + " 打印 " + (i+1));
            }
            System.out.println("end hello " + System.currentTimeMillis());
            reentrantLock.unlock();
            semaphore.release();
            System.out.println(" ThreadName = " + Thread.currentThread().getName() + " 结束 ThreadName = " + Thread.currentThread().getName() );
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
