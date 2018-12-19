package com.xupq.sort;

public class ShellSort {

    public static void sort(int[] arr){

        for (int gap = arr.length/2;
             gap > 0 ;
             gap/=2) {

            for (int i = gap; i < arr.length; i++) {

                int j=i;
                int temp = arr[i];
                if (arr[j] < arr[j-gap]) {
                    while (j-gap>=0 && temp< arr[j-gap]){

                        arr[j] = arr[j-gap];
                        j = j -gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sort1(int[] arr){
        int len = arr.length,
                temp,
                gap = 1;
        while (gap < len / 3) {          // 动态定义间隔序列
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap = (int) Math.floor(gap / 3)) {
            for (int i = gap; i < len; i++) {
                temp = arr[i];
                for (int j = i-gap; j > 0 && arr[j]> temp; j-=gap) {

                    arr[j + gap] = arr[j];
                    i = j;
                }

                arr[i] = temp;
            }
        }
    }


    public static void main(String[] args) {

        int[] aa= {23,3,1,5,23,67,1,44,90};
        sort1(aa);
        for (int i = 0; i < aa.length; i++) {
            System.out.println(aa[i]);

        }
    }
}
