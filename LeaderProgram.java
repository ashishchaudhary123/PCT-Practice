package pct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeaderProgram {

	Scanner sc;
	String input;
	String[] inputArray;
	int count = 0;
	Map<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String args[]) {

		LeaderProgram lp = new LeaderProgram();
		lp.input();
		lp.logic();

	}

	private void logic() {
		for (int i = 0; i < inputArray.length; i++) {

			int a = (Integer.parseInt(inputArray[i]));

			for (int b = i + 1; b < inputArray.length; b++) {
				int c = (Integer.parseInt(inputArray[b]));
				if (a > c) {
					map.put(inputArray[i], 1);
				} else {
					map.put(inputArray[i], 0);
					break;
				}
			}
		}
		for (String i : map.keySet()) {
			if (map.get(i).equals(1)) {
				System.out.print(i + " ");
			}

		}
		System.out.println(inputArray[inputArray.length-1]);

	}

	private void input() {

		sc = new Scanner(System.in);
		input = sc.nextLine();
		inputArray = input.split(" ");

	}
}
