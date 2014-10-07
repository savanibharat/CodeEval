package com.CodeEval.Easy.HexToDecimal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class HexToDecimal {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {
			System.out.println(Integer.parseInt(str, 16));
		}
	}
}
