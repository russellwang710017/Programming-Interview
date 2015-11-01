/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation. 
Valid operators are +, -, *, /. Each operand may be an integer or another expression. 
For example:

  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

  This problem can be solved by using a stack. We can loop through each element in the given array. 
  When it is a number, push it to the stack. When it is an operator, pop two numbers from the stack, do the 
  calculation, and push back the result.
*/

import java.io.*;
import java.util.*;
import java.lang.*;
public class evaluateReversePolish{
	public static void main(String[] args){
		String[] array = {"4", "13", "5", "/", "+"};
		int result = evaluateReverse(array);
		System.out.println(result);
		// String operator = "+-*/";
		// Stack<String> st = new Stack<String>();
		// int result;
		// for(String t: array){
		// 	if(!operator.contains(t)){ //if t is not an operator
		// 		//put in the stack
		// 		st.push(t);
		// 	}else{ //if t is an operator
		// 		//take 2 elements from the stack and do operations
		// 		int a = Integer.valueOf(st.pop());
		// 		int b = Integer.valueOf(st.pop());
		// 		switch(t){
		// 			case "+":
		// 					st.push(String.valueOf(a+b));
		// 					break;
		// 			case "-":
		// 					st.push(String.valueOf(b-a));
		// 					break;
		// 			case "*":
		// 					st.push(String.valueOf(a*b));
		// 					break;
		// 			case "/":
		// 					st.push(String.valueOf(b/a));
		// 					break;
		// 		}
		// 	}
		// }
		// result = Integer.valueOf(st.pop());
		// System.out.println(result);
	}

	public static int evaluateReverse(String[] array){
		String operator = "+-*/";
		Stack<String> st = new Stack<String>();
		int result;
		for(String t: array){
			if(!operator.contains(t)){ //if t is not an operator
				//put in the stack
				st.push(t);
			}else{ //if t is an operator
				//take 2 elements from the stack and do operations
				int a = Integer.valueOf(st.pop());
				int b = Integer.valueOf(st.pop());
				switch(t){
					case "+":
							st.push(String.valueOf(a+b));
							break;
					case "-":
							st.push(String.valueOf(b-a));
							break;
					case "*":
							st.push(String.valueOf(a*b));
							break;
					case "/":
							st.push(String.valueOf(b/a));
							break;
				}
			}
		}
		result = Integer.valueOf(st.pop());
		return result;
	}
}