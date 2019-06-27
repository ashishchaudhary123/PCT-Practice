package pct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MazorityElement {

	Scanner sc;
	String input;
	String[] input1;
	Map<String, Integer> map = new HashMap<String, Integer>();
	ArrayList<String> inputArray = new ArrayList<String>();

	public static void main(String args[]) {
		MazorityElement me = new MazorityElement();
		me.input();
		me.logic();

	}

	public void logic() {

		for (int i = 0; i < input1.length; i++) {
			if (!map.containsKey(input1[i])) {
				map.put(input1[i], 0);
			}

			map.put(input1[i], map.get(input1[i]) + 1);
		}

		Iterator it = map.entrySet().iterator();
		int value = 0;
		String key = "";
		for (String s : map.keySet()) {
			int a = map.get(s);
			if (a > value) {
				value = a;
				key = s;
			}
		}
		if(value > input1.length/2)
		System.out.println(key);
		else
			System.out.println("No Majority element");
	}

	public void input() {

		sc = new Scanner(System.in);
		input = sc.nextLine();
		input1 = input.split(" ");

	}

}
