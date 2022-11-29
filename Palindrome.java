package com.assignment;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String s1="";
		for (int j = s.length()-1; j >= 0; j--) {
			
			s1+=s.charAt(j);
		}
		//System.out.println(s1);
		if(s1.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}

