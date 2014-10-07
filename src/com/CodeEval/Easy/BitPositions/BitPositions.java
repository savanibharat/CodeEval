package com.CodeEval.Easy.BitPositions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BitPositions {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {
			convertToBinary(Integer.parseInt(str.split(",")[0]),
					Integer.parseInt(str.split(",")[1]),
					Integer.parseInt(str.split(",")[2]));
		}
	}

	private static void convertToBinary(int number, int bit1, int bit2) {
		int remainder;
		int b[] = new int[50];
		int i = 0;
		while (number != 0) {
			i++;
			b[i] = number % 2;
			number = number / 2;
		}
		if(b[bit1]==b[bit2]){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
	}
}
