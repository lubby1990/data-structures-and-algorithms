package com.lubby.node;
/**
 *@author    liubin
 *@data 	2015年2月13日
 *@time     下午1:29:14
 */
public class Node <T>{
	private T data;
	private Node <T> next ;
	
	
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
	
	
	
	

}
