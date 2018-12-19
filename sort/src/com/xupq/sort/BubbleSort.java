package com.xupq.sort;

public class BubbleSort {

    public static void sort(int[] arr) {

        int len = arr.length;
        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // 时间复杂度 O(n`2)
    // 空间复杂度 O(1)
    // 稳定 若a=b,a在b前，排序后 a依然在b前


    public static void main(String[] args) {

        int[] aa = {9,30,4,1,5,10,234,1};
        sort(aa);
        for (int i = 0; i < aa.length; i++) {

            System.out.println(aa[i]);;
        }
    }
}
