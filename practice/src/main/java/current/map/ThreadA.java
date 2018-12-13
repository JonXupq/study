package current.map;

public class ThreadA extends Thread{

    private MyService1 myService1;

    public ThreadA(MyService1 myService1) {
        this.myService1 = myService1;
    }

    @Override
    public void run() {

        for (int i = 0; i < 500000; i++) {

            myService1.map.put("threadA" + (i+1),"threadA" + (i+1));
            System.out.println("threadA" + (i+1));
        }
    }
}
