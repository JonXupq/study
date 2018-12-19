package com.xupq.sort;

public class InsertionSort {

    public static void sort(int[] arr){

        int len = arr.length;
        int preIndex,current;
        for (int i = 0; i < len; i++) {

            preIndex = i-1;
            current = arr[i];
            while ( preIndex>= 0 && arr[preIndex] > current){

                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1] = current;
        }
    }

    // 时间复杂度 O(n`2)
    // 空间复杂度 O（1）
    // 稳定

    public static void main(String[] args) {

        int[] aa= {23,3,1,5,23,67,1,44,90};
        sort(aa);
    }


}
