package HWDay11;

import java.util.Stack;

public class Factorial_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> fact = new Stack<>();
		fact.push(1);
		int num = 5;
		for(int i = 1; i<num;i++) {
			fact.push(fact.pop()*1);
		}
			System.out.println(fact.pop());
		

	}

}
