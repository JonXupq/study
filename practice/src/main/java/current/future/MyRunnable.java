package current.future;

public class MyRunnable implements Runnable {

    private UseInfo aa;

    public MyRunnable(UseInfo aa) {
        this.aa = aa;
    }

    @Override
    public void run() {

        aa.setUsername("1111");
        aa.setPassword("222");
    }
}
