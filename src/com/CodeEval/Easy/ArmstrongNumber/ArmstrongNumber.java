package com.CodeEval.Easy.ArmstrongNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArmstrongNumber {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if (br != null) {

			String str = "";
			try {
				while ((str = br.readLine()) != null) {

					if (Integer.parseInt(str) >= 0
							&& Integer.parseInt(str) <= 9) {
						System.out.println("True");
						continue;
					}

					boolean b = isArmstrong(Integer.parseInt(str));
					if(b){
						System.out.println("True");
					}
					else{
						System.out.println("False");
					}

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static boolean isArmstrong(int num) {

		int original = num;
		int result = 0;
		int length=length(num);
		while (num != 0) {

			int remainder = num % 10;
			
			result = (int) (result + (Math.pow(remainder,length)));
			num = num / 10;
			

		}
		if (original == result)
			return true;
		return false;

	}
	static int length(int  n){
		int length=0;
		while(n!=0){
			
			n=n/10;
			length++;
		}
		return length;
	}
	static BufferedReader getBufferedReader(String path) {

		try {
			return new BufferedReader(new FileReader(new File(path)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
