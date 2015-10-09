package com.algorithms.sort;

/**
 * Created by liubin on 2015-10-8.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        int[] b = {10,50,20,30,14,12};

        insertSort(a);
        for (int i : a) {
            System.out.print(i + ",");
        }


        System.out.println("");
        insertSortByDesc(b);
        for (int j : b) {
            System.out.print(j + ",");
        }

    }

    public  static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            //insert into the index before a[i];

            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
    public static void insertSortByDesc(int[] a) {
        for (int i = 1; i < a.length; i ++) {
            int key = a[i];
            int j = i -1;
            while (j >= 0 && a[j] < key) {
                a[j+1] = a[j];
                j --;
            }
            a[j+1] = key;
        }
    }
}
