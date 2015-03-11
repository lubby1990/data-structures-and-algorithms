package com.lubby.stack;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**  
 * 
 * @author liubin   
 * @version 创建时间：2015年2月15日 下午6:30:52  
 * 
 */
public class Calculator {
	public static void main(String[] args){
		Stack<BigDecimal> numStack = new Stack<BigDecimal>();
		Stack<String> opStack = new Stack<String>();
		calculate(new String("(1.1+2)*3"),numStack,opStack);
	}
	
	
	private static double calculate(String equation,Stack<BigDecimal> numStack , Stack<String> opStack){
		boolean HL = false;
		char[] expressions = equation.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i <= expressions.length - 1; i++){
			List<BigDecimal> numList = new ArrayList<BigDecimal>();
			//if character is ')' then calcuate
			if(String.valueOf(expressions[i]).equals(")")){
				while(!numStack.peek().equals("(")){
					numList.add(numStack.pop());
//					BigDecimal a = numStack.pop();
					opStack.pop();
//					BigDecimal b = numStack.pop();
				}
			}
			
			
			if(i == 0 && String.valueOf(expressions[i]).equals("(")){
				opStack.push("(");
				continue;
			}
			
			if(String.valueOf(expressions[i]).matches("\\+|\\-")){
				opStack.push(String.valueOf(expressions[i]));
			}
			if(String.valueOf(expressions[i]).matches("\\*|\\/")){
				HL = true;
			}
			
			
			if(Character.isDigit(expressions[i]) || String.valueOf(expressions[i]).equals(".")){
				sb.append(expressions[i]);
			}else{
				numStack.push(new BigDecimal(sb.toString()));
			}
			 sb = new StringBuffer();

		}
//		
//		String[] euations = equation.split("\\+|\\-|\\*|\\/\\%|\\(|\\)",4);

//		for(String str : euations){
//			
//			System.out.println(str + "---");
//		}
		
		return 0;
	}
	
	

}
