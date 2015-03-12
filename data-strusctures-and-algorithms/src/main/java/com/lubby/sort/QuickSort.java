package com.lubby.sort;
/**
 *@author    liubin
 *@data 	2015年3月12日
 *@time     下午6:49:33
 */
public class QuickSort {
	
	public static void main(String[] args){
		int[] array = {2,6,4,8,1,9,1,7};
		quickSort(array, 0, array.length-1);
		for(int a : array){
			System.out.println(a);
		}
	}
	public static void quickSort(int[] array , int l , int r){
		
		if(l < r){
		int i =	sort(array,l,r);
		quickSort(array,l,i-1);
		quickSort(array,i+1,r);
		}
	
	}
	public static int sort(int[] array , int l,int r){
		  int i = l ;
		  int j = r;
		  int key = array[l];
		  
		  while(i < j){
			   while(i < j && array[j] >= key){
				   j--;
			   }
			   if(i < j){
				   array[i] = array[j];
				   i++;
			   }
			   while(i<j && array[i] < key){
				   i++;
			   }
			   if(i < j){
				   array[j] = array[i];
				   j--;
			   }
		  }
		  array[i] = key;
		  return i;
	}



}
