package com.lubby.binarytree;
/**  
 * 
 * @author liubin   
 * @version 创建时间：2015年2月26日 下午1:17:25  
 * 
 */
public class BinaryTreeNode<T> {
	private T data;
	private BinaryTreeNode<T> lChild;
	private BinaryTreeNode<T> rChild;
	
	
	
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public BinaryTreeNode<T> getlChild() {
		return lChild;
	}
	public void setlChild(BinaryTreeNode<T> lChild) {
		this.lChild = lChild;
	}
	public BinaryTreeNode<T> getrChild() {
		return rChild;
	}
	public void setrChild(BinaryTreeNode<T> rChild) {
		this.rChild = rChild;
	}
	
	
	

}
