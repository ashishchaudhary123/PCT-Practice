package pct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Bracket_Stack {

	int number, paranthesis_count, Square_count, curly_count = 0;
	Scanner sc;
	String input, bracket_check, input2;
	String[] bracket_array;
	ArrayList<String> input1 = new ArrayList<>();
	HashMap<String, Integer> hm = new HashMap<>();
	Stack<String> stack = new Stack<>();

	public static void main(String args[]) {
		Bracket_Stack bn = new Bracket_Stack();
		bn.input();
		bn.logic();
		/*
		 * (the[is]{valid}) (the[is]{valid)) {the(is[valid])} (the](is}{valid)
		 */
	}

	private void logic() {

		boolean flag = true;
		String previous, current;

		for (int a = 0; a < input1.size(); a++) {
			input2 = input1.get(a);
			bracket_array = input2.split("");
			Stack<String> stack = new Stack<>();
			
			for (int i = 0; i < bracket_array.length; i++) {

				if (bracket_array[i].equals("(") || bracket_array[i].equals("[") || bracket_array[i].equals("{")) {
					stack.push(bracket_array[i]);
					//System.out.println("stack after push = " + stack);
				} else if (bracket_array[i].equals(")") || bracket_array[i].equals("]")
						|| bracket_array[i].equals("}")) {
					current = bracket_array[i];

					//System.out.println("current = " + current);
					if (stack.isEmpty()) {
						flag = false;
						break;
					} else {
						previous = stack.peek();
						//System.out.println("previous = " + previous);
						if ((current.equals(")") && previous.equals ("(")) || (current.equals("]") && previous.equals("["))
								|| (current .equals ("}") && previous .equals ("{"))) {
							stack.pop();
						//	System.out.println("stack after poping = " + stack);
							flag = true;
						} else {
							flag = false;
							break;
						}
					}
				}

			}
			//System.out.println("final stack = " + stack);
			if (flag == true && stack.isEmpty())
				System.out.println("TRUE");
			else
				System.out.println("FALSE");
		}
	}

	private void input() {
		sc = new Scanner(System.in);
		number = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < number; i++) {
			input1.add(sc.nextLine());
		}

	}

}
