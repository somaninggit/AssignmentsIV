package com.assignment;
import java.util.Scanner;

class Check {
	public void check() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = s.toLowerCase();
//		char ch[]=s1.toCharArray();
		boolean f = true;;
		for (char ch1 = 'a'; ch1 < 'z'; ch1++) {
			if (!s1.contains(String.valueOf(ch1))) {
				f=false;
				break;
			}
		}
		if(f)
		{
			System.out.println("Panagram");
		}
		else
		{
			System.out.println("Not a Panagram");
		}

	}
}

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check();
		c.check();

	}

}

