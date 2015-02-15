package com.lubby.link;

import java.util.concurrent.Executors;


/**
 *@author    liubin
 *@data 	2015年2月13日
 *@time     下午1:31:45
 */
public class LinkedListTest {
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.insert(4, 0);
		list.remove(0);
		System.out.println(list.getTheLast());
		System.out.println(list.get(0));
		
	}

}
