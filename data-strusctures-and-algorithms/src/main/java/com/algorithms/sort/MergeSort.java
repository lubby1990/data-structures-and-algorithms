package com.algorithms.sort;

/**
 * Created by liubin on 2015-10-8.
 */
public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5,3,2,8,7,6,10,20,30,11,22,33,44,100,60,200};

        mergeSort(a, 0, a.length - 1);

        for (int i : a) {
            System.out.println(i);
        }
    }

    //递归调用
    public static void mergeSort(int[] a, int low, int high) {
        int middle = (low + high) / 2;
        if (low < high) {
            mergeSort(a, low, middle);
            mergeSort(a, middle + 1, high);
            merge (a, low, middle, high);
        }
    }

    //合并两段有序数列
    public static void merge(int[] a, int low, int middle, int high) {
        int n1 = middle - low + 1;
        int n2 = high - middle;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = low, j = 0; i <= middle; i++, j++) {
            l[j] =a[i];
        }

        for (int i = middle + 1, j= 0; i <= high; i++, j++) {
            r[j] = a[i];
        }

        int i = 0;
        int j = 0;
        int k = low;
        while(i < n1 || j < n2) {
            if (i < n1 && j < n2) {
                if (l[i] < r[j]) {
                    a[k++] = l[i];
                    i++;
                }else {
                    a[k++] = r[j];
                    j++;
                }
            } else if (i < n1) {
                a[k++] = l[i];
                i++;
            } else if (j < n2) {
                a[k++] = r[j];
                j++;
            }
        }
    }
}