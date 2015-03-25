package com.lubby.stack;
/**  
 * 
 * @author liubin   
 * @version 创建时间：2015年2月15日 下午5:47:20  
 * 
 */


public class DeminalConversion {
	public static void main(String[] args) {
		
		String binary = conversion(100L, 2);
		System.out.println(binary);
		
	}	
	/** conver the deminal to given scale**/
	private static String conversion(Long deminalNum,int scale){
		if(scale <= 0 ){
			throw new RuntimeException("scale can not less than or queal 0");
		}
		
		Stack<Long> stack = new Stack<Long>();
		Long num = 0L;
		
		while ( (num = deminalNum / scale) != 0) {
			stack.push(deminalNum % scale);
			deminalNum = num;
		}
		
		StringBuffer sb = new StringBuffer();
		
		if(stack.getSize() != 0 && stack.peek() == 0){
			stack.pop();
		}
		
		while (stack.getSize() != 0) {
			sb.append(stack.pop());
			
		}
		
		
		return sb.toString();
	}

}
