package com.lubby.fornew;

/**
 * Created by liubin on 2015-9-30.
 */
public class InsertSort {
    public static void main () {
        int[] a = {5,4,3,3,2,1,-4};
        inserSort(a);
        for (int i : a) {
            System.out.println(i + ",");
        }
    }

    public static void inserSort(int[] a) {
        int key;
        for (int i = 2; i < a.length; i ++ ) {
            key = a[i];
            //insert into befor a[i];

            int j = i - 1;
            while (j > 0 && a[j] > key) {
                a[j+1] = a[j];
                j --;
            }
            a[j+1] = key;
        }

    }
}
