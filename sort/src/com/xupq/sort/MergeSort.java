package com.xupq.sort;

public class MergeSort {

    public static void sort(int[] arr, int left, int right){

        if(left >= right){
            return;
        }

        int center = (left + right) / 2;
        sort(arr, left, center);
        sort(arr, center+1, right);
        merge(arr, left, center, right);

    }

    public static void merge(int[] arr, int left, int center, int right){

        int[] tmpArr = new int[arr.length];
        int mid = center + 1;
        int third = left;
        int tmp = left;
        while(left <= center && mid <= right){

            if(arr[left] <= arr[mid]){
                tmpArr[third++] = arr[left++];
            }else{
                tmpArr[third++] = arr[mid++];
            }
        }

        while (mid <= right){
            tmpArr[third++] = arr[mid++];
        }
        while (left <= center){
            tmpArr[third++] = arr[left++];
        }

        while(tmp <= right){

            arr[tmp] = tmpArr[tmp++];
        }

    }

    public static void main(String[] args) {

        int[] aa= {23,3,1,5,23,67,1,44,90};
        sort(aa, 0, aa.length);
    }
}
