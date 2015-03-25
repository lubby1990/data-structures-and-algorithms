package com.lubby.link;

import com.lubby.node.Node;

/**
 *@author    liubin
 *@data 	2015年2月13日
 *@time     下午1:33:46
 */
public class LinkedList<T> {
	private Node<T> head;
	private int size;

	
	/** add the node to the end of the link **/
	public Node<T> add(T data ){
		
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(null);
		
		if(head == null){
			head = node;
			size ++ ;
			return head;
		}
		
		Node<T> p = head;
		
		while(p.getNext() != null){
			p = p.getNext();
		}
		p.setNext(node);
		
		size ++ ;
		return head;
	}
	
	/** remove the given position node**/
	public Node<T> remove(int position){
		if(position < 0 || position >= size ){
			throw new RuntimeException("out of the list  boundery"); 
		}
		Node<T> p = head;
		
		int temp = 0;
		if(position == 0){
			head = p.getNext();
			size ++;
			return p;
		}
		
		while(p.getNext() != null && temp != position -1 ){
			p = p.getNext();
			temp ++;
		}
		p.setNext(p.getNext().getNext());
		size --;
		return head;
	}
	
	
	
	
	/** **/
	public T get(int position){
		
		if(position <0 || position >= size){
			throw new RuntimeException("out of boundery");
		}
		Node<T> p = head;
		int temp = 0;
		while(p.getNext() != null && temp != position){
			p = p.getNext();
			temp ++;
		}
		 
		return p.getData();
	}
	
	
	/** remove the last node . if the head is null throw Exception**/
	public T getTheLast(){
		if(size == 0){
			throw new RuntimeException("the list size is 0");
		}
		Node<T> p = head;
		int temp = 0;
		
		while(p.getNext() != null ){
			p = p.getNext();
			temp ++;
		}
		 
		return p.getData();
	}
	
	/** insert into the given position**/
	public T insert(T data ,int position){
		if(position <0 || position >= size){
			throw new RuntimeException("out of boundery");
		}
		
		if(position == size -1){
			add(data);
		}
		
		Node<T> node = new Node<T>();
		node.setData(data);
		
		Node<T> p = head;
		int temp = 0;
		
		if(position == 0){
			node.setNext(p);
			head =	node;
			size ++;
			return data;
		}
		while(p.getNext() != null && temp != position -1){
			p = p.getNext();
			temp ++;
		}
		node.setNext(p.getNext().getNext());
		p.setNext(node);
		size ++;
		return data;
		
	}
	
	
	
	public int size(){
		return this.size;
	}
	

}
