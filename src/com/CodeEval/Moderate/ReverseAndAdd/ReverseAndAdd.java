package com.CodeEval.Moderate.ReverseAndAdd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReverseAndAdd {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {
			int iter=0;
			int number = Integer.parseInt(str);
			int sum = number + reverse(number);
			iter++;
			for (;;) {
				if (isPalindrome(sum)) {
					break;
				}
				else{
					sum=sum+reverse(sum);
					iter++;
				}
			}
			System.out.println(iter+" "+sum);
		}
	}

	static boolean isPalindrome(int num) {

		int n = num;
		int rev = 0;
		int dig=0;
		while (num > 0) {
			dig = num % 10;
			rev = rev * 10 + dig;
			num = num / 10;
		}
		return n==rev;
	}

	static int reverse(int n) {
		int reverse = 0;
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}
		return reverse;
	}
}
