package com.lubby.stack;
/**
 *@author    liubin
 *@data 	2015年2月15日
 *@time     下午1:11:32
 */

public class StackTest {
	
	public static void main(String[] args){
		Stack<String> stack = new Stack<>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		String data = stack.pop();
//		String data = stack.peek();
		System.out.println(data);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
	
	

}
