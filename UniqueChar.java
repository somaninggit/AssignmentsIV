package com.assignment;

import java.util.Scanner;

class Unique {
	public void unique(String s) {
		boolean f = false;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					f = true;
				}
			}

		}
		if (f == true) {
			System.out.println("NO,All charecters are not unique");
		} else {
			System.out.println("YES,All charecters are  unique");
		}
	}
}

public class UniqueChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a new String");
		String s = sc.nextLine();
		Unique u = new Unique();
		u.unique(s);
	}

}
