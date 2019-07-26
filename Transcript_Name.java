package pct;

import java.util.ArrayList;
import java.util.Scanner;

public class Transcript_name {
	
	Scanner sc;
	String input;
	String [] name_array;
	ArrayList <String> name = new ArrayList<>();
	
	public static void main(String args[])
	{
		Transcript_name tn = new Transcript_name();
		tn.input();
		tn.logic();
		
	}

	private void logic() {
		
		
		
		if(name.size() == 3)
		{
			System.out.println(name.get(2) + " " + name.get(0) + " " + name.get(1));
			
		}
		else if(name.size() == 2)
		{
		
			char[]	last_Name = name.get(1).toCharArray();
			char last_char = last_Name[last_Name.length - 1];
		
			String lc = String.valueOf(last_char);
			
			if(lc.equalsIgnoreCase("a") || lc.equalsIgnoreCase("e") || lc.equalsIgnoreCase("i") || lc.equalsIgnoreCase("o") || lc.equalsIgnoreCase("u"))
			{
				System.out.println(name.get(1) + " " + name.get(0));
			}			
			else
				System.out.println(name.get(0) + " " + name.get(1));
			
		}
		else
		{
			System.out.println(name.get(0));
		}
		
	}

	private void input() {

		sc = new Scanner(System.in);
		input = sc.nextLine();
		name_array = input.split(" ");
		
		
		for(int i = 0 ; i< name_array.length ; i++)
		{
			name.add(name_array[i]);
		}
		
	}
}
