package com.lubby.algorithms;

/**
 * @author Lubby
 * @date 2015年3月24日 上午9:52:01
 *
 */
public class NodeReverse {
	// 翻转一个给定的链表  用循环和递归分别取实现

	public static void main(String[] args) {

		
		Node<Integer> head = new Node<Integer>(1);
		Node<Integer> n1 = new Node<Integer>(2);
		Node<Integer> n2 = new Node<Integer>(3);
		Node<Integer> n3 = new Node<Integer>(4);
		Node<Integer> n4 = new Node<Integer>(5);
		Node<Integer> n5 = new Node<Integer>(6);
		Node<Integer> n6 = new Node<Integer>(7);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		n4.next = n5;
		n5.next = n6;
		
		NodeReverse nodeReverse = new NodeReverse();
		Node<Integer> t = nodeReverse.reverseLoop(head);
//		Node<Integer> t = nodeReverse.reverseRecursive(null,head);

		while(t != null){
			System.out.println(t.data);
			t = t.next;
		}
		
	}
	
	public Node<Integer> reverseLoop(Node<Integer> head){
		
		Node<Integer>  p = head;
		Node<Integer>  q = p.next;
		Node<Integer>  r = q;
		p.next = null;
		while(q != null){
		r = q.next;
		q.next = p;
		p = q;
		q = r;
		}
		return p;
	}
	
	
	public Node<Integer> reverseRecursive(Node<Integer> p,Node<Integer> q){
		Node<Integer> result = null;
		if(q == null){
			return p;
		}else{
			final Node<Integer> r = q.next;
			q.next = p;
			result = reverseRecursive(q,r);
		}
		
		return result;
		
	}
	
	

	static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}

		public Node() {
			super();
		}

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

}
