package com.algorithms.sort;

/**
 * Created by liubin on 2015-10-8.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5,4,6,1,2,1,1,100,55,40};
        selectionSort(a);
        for (int b : a) {
            System.out.println(b);
        }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int key = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
