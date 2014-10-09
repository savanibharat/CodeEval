package com.CodeEval.Moderate.DecimalToBinary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DecimalToBinary {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {
			if (str.length() < 1)
				continue;
			boolean isNumber = true;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) < 48 || str.charAt(i) > 58) {
					isNumber = false;
					continue;
				}
			}
			
			
			if (isNumber) {
				if(Integer.parseInt(str)>Integer.MAX_VALUE)
					continue;
				ArrayList<Integer> binary = convertToBinary(Integer
						.parseInt(str));
				ArrayList<Integer> b = new ArrayList<Integer>(binary.size());
				for (int i = binary.size() - 1; i >= 0; i--) {
					b.add(binary.remove(i));
				}
				for (Integer i : b) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
	}

	static ArrayList<Integer> convertToBinary(int a) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (a != 0) {
			int temp = a % 2;
			arr.add(temp);
			a = a / 2;
		}
		return arr;
	}
}
