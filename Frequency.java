package com.assignment;
import java.util.Scanner;

class FrequencyCheck {
	public void frequency(String s1) {
		int vCount = 0;
		int cCount = 0;
		int nCount = 0;
		int chCount = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'o' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				vCount++;
			} else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				cCount++;
			} else if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				nCount++;

			} else {
				chCount++;
			}

		}
		System.out.println("Number of vowels are" + cCount);
		System.out.println("Number of consonents" + cCount);
		System.out.println("Number of integers" + nCount);
		System.out.println("Number of charecters" + chCount);

	}
}

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a new String");
		String s = sc.nextLine();
		String s1 = s.toLowerCase();
		System.out.println(s1);
		FrequencyCheck f = new FrequencyCheck();
		f.frequency(s1);
	}

}

