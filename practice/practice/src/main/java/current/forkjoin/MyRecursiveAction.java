package current.forkjoin;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {


    private int beginValue;
    private int endValue;

    public MyRecursiveAction(int beginValue, int endValue) {

        this.beginValue = beginValue;
        this.endValue = endValue;
    }

    @Override
    protected void compute() {

        System.out.println(Thread.currentThread().getName() + " ----------- ");
        if(endValue - beginValue >2){

            int middleNum = (beginValue + endValue) / 2;
            MyRecursiveAction leftAction = new MyRecursiveAction(beginValue, endValue);
            MyRecursiveAction rightAction = new MyRecursiveAction(middleNum + 1, endValue);
            MyRecursiveAction.invokeAll(leftAction, rightAction);

        }else {

            System.out.println(" 打印组合为： " + beginValue + " -- " + endValue);
        }


    }
}
