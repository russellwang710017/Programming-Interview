/*
You are given two linked lists representing two non-negative numbers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

import java.util.LinkedList;

public class addTwoNumbersLinkedList{
	public static void main(String[] args){
		System.out.println("Running");
		//Creating 2 linked list
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		int p1 = 0;
		int p2 = 0;
		int carry = 0;

		l1.add(2);
		l1.add(4);
		l1.add(3);

		l2.add(5);
		l2.add(6);
		l2.add(4);		
		
		while(p1 < l1.size() || p2 < l2.size()){
			if(p1 < l1.size()){
				carry += l1.get(p1);
				p1++;
			}

			if(p2 < l2.size()){
				carry += l2.get(p2);
				p2++;
			}

			l3.add(carry%10);
			
			carry /= 10;
		}

		if(carry == 1){
			l3.add(carry);
		}
		System.out.println(l3);
	}

	// public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2){
	// 	int p1 = 0;
	// 	int p2 = 0;
	// 	int carry = 0;


	// }
}