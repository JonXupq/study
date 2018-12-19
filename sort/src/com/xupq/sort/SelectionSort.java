package com.xupq.sort;

public class SelectionSort {

    public static void sort(int[] arr){

        int len = arr.length;
        int temp;
        for (int i = 0; i < len - 1; i++) {

            int minIndex = i;
            for (int j = i+1; j < len; j++) {

                if(arr[j] < arr[i]){

                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = arr[i];
        }
    }

    // 时间复杂度 O(n`2)
    // 空间复杂度 O(1)
    // 不稳定
}
