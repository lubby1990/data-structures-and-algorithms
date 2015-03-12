package com.lubby.sort;
/**
 *@author    liubin
 *@data 	2015年3月12日
 *@time     下午1:18:30
 */
public class BubbleSort {
	public static void main(String[] args){
		int[] array = {5,8,1,6,6,2,1,};
		bubbleSort(array);
		for(int a : array){
			System.out.println(a);
		}
	}
	public static void bubbleSort(int[] array){
		for(int i = 0; i < array.length ; i ++){
			for(int j =0; j < array.length - i - 1; j ++ ){
				if(array[j] > array[j+1]){
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
