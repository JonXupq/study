package cn.xpq.test.Array;

import java.util.ArrayList;

public class Lesson1 {

    public static void main(String[] args) {

        int[] ints = {1, 1, 2, 3, 5, 7, 1, 1, 2, 3, 4};
//        method1(ints);
        System.out.println(method3(30));
        System.out.println(method4(30));
        System.out.println(method5(30));
    }


    public static void method1(int[] arr){

        int[] temp = new int[10];
        for (int i = 0; i < arr.length; i++) {

            temp[arr[i]]++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {

            for (int j = 0; j < temp[i]; j++) {

                list.add(i);
            }
        }

        for (Integer a : list ) {

            System.out.println(a);
        }
    }


   // 判断奇偶数
    public static void method2(int a){

        if(a % 2 == 1){

        }

       if( (a & 1) == 1){

       }
    }

    // 递归
    public static int method3(int n){

        if(n <= 2){

            return n;
        }else {

            return method3(n-1) + method3(n-2);
        }
    }

    static int[] ints = new int[1000];
    // 递归 优化
    public static Integer method4(int n){
        if(n <= 2){

            return n;
        }else {

            if(ints[n] != 0){

                return ints[n];
            }else {

                ints[n] = method4(n-1) + method4(n-2);
                return ints[n];
            }
        }
    }

    // 递归 优化
    public static Integer method5(int n){
        if(n <= 2){

            return n;
        }else {

           int f1 = 1;
           int f2 = 2;
           int sum = 0;
           for (int i = 3; i <= n; i++) {

                sum = f1 + f2;
                f1 = f2;
                f2 = sum;
           }

            return sum;
        }
    }
}
