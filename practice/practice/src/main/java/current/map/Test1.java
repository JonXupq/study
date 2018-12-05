package current.map;

public class Test1 {

    public static void main(String[] args) {

        MyService1 myService1 = new MyService1();
        ThreadA threadA = new ThreadA(myService1);
        threadA.start();

    }
}
