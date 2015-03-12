package com.lubby.sort;
/**
 *@author    liubin
 *@data 	2015年3月12日
 *@time     下午1:03:42
 */
public class InsertSort {
		public static void main(String[] args){
			int[] array = {3,2,1};
			insertSort(array);
			for(int a : array){
				System.out.println(a);
			}
		}
	
	public static void insertSort(int[] array){
		
		int i =0;
		int key = 0;
		
		for(int j=1; j < array.length ; j ++){
			  key = array[j];
			  i = j-1;
			  
			  while(i >= 0 && array[i] >key){
				  array[i+1] = array[i];
				  i --;
			  }
			array[i+1] = key;
		}
		
		
		
	}
	
	
	
	

}
