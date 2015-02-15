package com.lubby.stack;

import com.lubby.node.Node;

/**
 *@author    liubin
 *@data 	2015年2月13日
 *@time     下午4:30:24
 */
public class Stack <T>{
	 private int size;
	 private Node<T> top;
	 private Node<T> base;	
	
	
	 /** push the data into stack's top**/
	public T push(T data){
		
		Node<T> node = buildNode(data);
		
		if(base == null){
			base = node;
			top = node;
			size++;
			return data;
		}
		
		node.setNext(top);
		top = node;
		size ++;
		return data;
	}
	
	
	public T pop(){
		T data;
		if(size == 0){
			throw new RuntimeException("out of boundery");
		}
		
		
		if(top == base){
			data = top.getData();
			top = null;
			base = null;
			size --;
			return data;
		}
		
		Node<T> node = top;
		top = node.getNext();
		
		data = node.getData();
		size --;
		return data;
	}

	
	public T peek(){
		
		if(size == 0){
			throw new RuntimeException("out of boundery");
		}
		
		return top.getData();
	}
	
	public int getSize(){
		return size;
	}
	
	private Node<T> buildNode(T data){
		Node<T> node = new Node<>();
		node.setData(data);
		return node;
	}

}
