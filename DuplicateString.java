package com.assignment;
import java.util.Scanner;

class DuplicateS {
	public void duplicate(String s) {
		String s1 = new String(s);
		System.out.println("Parent String of length");
		System.out.println(s1.length());
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			boolean f = false;
			for (int j = 0; j < s2.length(); j++) {
				if (s2.charAt(j) == s1.charAt(i)) {
					f = true;
					break;
				}

			}
			if (f == false) {
				s2 += s1.charAt(i);
			}
		}
		System.out.println("String after removal of length");
		System.out.println(s2);
		System.out.println(s2.length());
		
		compare(s1, s2);
	}

	public void compare(String s1, String s2) {
		String s3 = "";
		for (int i = 0; i < s2.length(); i++) {
			int count = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) == s2.charAt(i)) {
					count++;

				}

			}
			if (count > 1) {
				for (int k = 0; k < count - 1; k++) {
					s3 = s3 + s1.charAt(i);
				}
			}
		}
		System.out.println("Duplicate String of length");
		System.out.println(s3.length());
		System.out.println(s3);

	}
}

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a new String");
		String s = sc.nextLine();
		DuplicateS d = new DuplicateS();
		d.duplicate(s);
	}

}

