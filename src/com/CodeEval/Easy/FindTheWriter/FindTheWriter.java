package com.CodeEval.Easy.FindTheWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FindTheWriter {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {

			if (str.length() > 1) {
				String data = str.split("\\|")[0];

				String[] index = str.split("\\|")[1].split(" ");
				for (int i = 1; i < data.length(); i++) {
					System.out.println(data.charAt(Integer.parseInt(index[i])));
				}
				System.out.println();
			}
		}
	}
}
