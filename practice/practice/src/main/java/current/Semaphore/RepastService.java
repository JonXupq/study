package current.Semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class RepastService {

    volatile private Semaphore setSemaphore = new Semaphore(10);
    volatile private Semaphore getSemaphore = new Semaphore(1);
    volatile private ReentrantLock lock = new ReentrantLock();
    volatile private Condition getCondition = lock.newCondition();
    volatile private Condition setCondition = lock.newCondition();
    volatile private Object[] objects = new Object[2];

    public boolean isEmpty(){

        boolean isEmpty = true;
        for (int i = 0; i < objects.length; i++) {

            if(objects[i] != null){

                isEmpty = false;
                break;
            }
        }

        return isEmpty;
    }

    public boolean isFull(){

        boolean isFull = true;
        for (int i = 0; i < objects.length; i++) {

            if (objects[i] == null){

                isFull = false;
                break;
            }
        }

        return isFull;
    }

    public void set(){

        try {
            System.out.println("set");
            setSemaphore.acquire();
            lock.lock();
            while (isFull()){

                setCondition.await();
            }

            for (int i = 0; i <  objects.length; i++) {

                if(objects[i] == null){

                    objects[i] = "数据 " + i;
                    System.out.println(Thread.currentThread().getName() + " 生产了 " + objects[i]);
                    break;
                }
            }

            getCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {

            setSemaphore.release();
        }
    }

    public void get(){

        try {
            System.out.println("get");
            getSemaphore.acquire();
            lock.lock();
            while ( isEmpty() ){

                getCondition.await();
            }

            for (int i = 0; i < objects.length; i++) {

                if(objects[i] != null){

                    System.out.println(Thread.currentThread().getName() + " 消费了 " + objects[i]);
                    objects[i] = null;
                    break;
                }
            }

            setCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            getSemaphore.release();
        }
    }
}
