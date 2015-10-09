package com.algorithms.sort;

/**
 * Created by liubin on 2015-10-9.
 */
public class PopSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,5,6,8,1,2};
        popSort(a);

        for (int i = 0; i < a.length; i ++) {
            System.out.println(a[i]);
        }
    }

    public static void popSort(int[] a) {
        for (int i = 0; i < a.length - 1; i ++) {
            for (int j = 0; j < a.length - i - 1; j ++) {
                if (a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }
}
