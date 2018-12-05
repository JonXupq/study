package current.exchanger;

import java.util.concurrent.Exchanger;

public class Main01 {

    public static void main(String[] args) {

        Exchanger<String> objectExchanger = new Exchanger<>();

        ThreadA a = new ThreadA(objectExchanger);
        Thread b = new Thread(new ThreadB(objectExchanger));
        a.start();
        b.start();
        System.out.println("main end");

    }
}
