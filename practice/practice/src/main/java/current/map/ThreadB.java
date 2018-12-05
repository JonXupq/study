package current.map;

public class ThreadB extends Thread {
    private MyService1 myService1;

    public ThreadB(MyService1 myService1) {
        this.myService1 = myService1;
    }

    @Override
    public void run() {

        for (int i = 0; i < 500000; i++) {

            myService1.map.put("threadB" + (i+1),"threadB" + (i+1));
            System.out.println("threadB" + (i+1));
        }
    }
}
