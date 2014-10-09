package com.CodeEval.Moderate.Modulus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Modulus {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {

			int number = Integer.parseInt(str.split(",")[0]);
			int modulo = Integer.parseInt(str.split(",")[1]);
			if (number < modulo) {
				System.out.println(number);

			} else {
				System.out.println(number-modulo*(number/modulo));
			}
		}
	}
}
