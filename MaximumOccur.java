package com.assignment;
import java.util.Scanner;

public class MaximumOccur {
	public void maximum(String s) {
		int count[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}
		int max = -1;
		char result=' ';
		for (int i = 0; i < s.length(); i++) {
			if (max < count[s.charAt(i)]) {
				max=count[s.charAt(i)];
				result=s.charAt(i);
			}
		}
		System.out.println(result + "--->"+ max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a new String");
		String s = sc.nextLine();
		MaximumOccur m = new MaximumOccur();
		m.maximum(s);
	}

}

