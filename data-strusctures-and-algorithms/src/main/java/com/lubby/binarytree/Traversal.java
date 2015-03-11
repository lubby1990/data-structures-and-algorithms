package com.lubby.binarytree;

import com.lubby.stack.Stack;

/**  
 * 
 * @author liubin   
 * @version 创建时间：2015年2月26日 下午1:20:14  
 * 
 */
public class Traversal {
	
	
	public static void main(String[] args){
		
		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>();
		
		node.setData(10);
		
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>();
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>();
		node1.setData(20);
		node2.setData(30);
		
		node.setlChild(node1);
		node.setrChild(node2);
		BinaryTreeNode<Integer> node11 = new BinaryTreeNode<Integer>();
		BinaryTreeNode<Integer> node22 = new BinaryTreeNode<Integer>();
		node11.setData(40);
		node22.setData(50);
		node1.setlChild(node11);
		node1.setrChild(node22);
		BinaryTreeNode<Integer> node33 = new BinaryTreeNode<Integer>();
		node33.setData(60);
		node2.setrChild(node33);

		Traversal traversal = new Traversal();
//		traversal.postTraversal(node);
		traversal.preTraversalByStack(node);
		
		
	}
	
	public void preTraversal(BinaryTreeNode<Integer> root){
		
		if(root == null){
			System.out.println("null");
		}else{
			System.out.println(root.getData());
		}
		
		
		if(root.getlChild() != null){
			preTraversal(root.getlChild());
		}
		if(root.getrChild() != null){
			preTraversal(root.getrChild());
		}
	}
	
	public void midTraversal(BinaryTreeNode<Integer> root){

		if(root == null){
			System.out.println("null");
		}
		
		if(root.getlChild() != null){
			midTraversal(root.getlChild());
		}
		
		System.out.println(root.getData());
		
		if(root.getrChild() != null){
			midTraversal(root.getrChild());
		}
		
	}
	
	public void postTraversal(BinaryTreeNode<Integer> root){

		if(root == null){
			System.out.println("null");
		}
		
		if(root.getlChild() != null){
			postTraversal(root.getlChild());
		}
		
		
		if(root.getrChild() != null){
			postTraversal(root.getrChild());
		}
		System.out.println(root.getData());
		
	}
	
	public void preTraversalByStack(BinaryTreeNode<Integer> node){
		Stack<BinaryTreeNode<Integer>> stack = new Stack<BinaryTreeNode<Integer>>();
		while (node != null || stack.getSize() != 0){
			
			while(node != null){
				System.out.println(node.getData());
				stack.push(node);
				node = node.getlChild();
			}
			
			if(stack.getSize() != 0){
				node = stack.pop();
				node = node.getrChild();
			}
			
			
		}
		
		
		
		
		
	}

}
