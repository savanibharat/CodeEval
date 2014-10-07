package com.CodeEval.Easy.SwapElements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SwapElements {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {

			String[] set = str.split(" : ")[0].split(" ");
			String swapper = str.split(" : ")[1];
			String[] temp = {};
			if (swapper.contains(",")) {
				temp = swapper.split(", ");
				for (int i = 0; i < temp.length; i++) {
					int position1 = Integer.parseInt(temp[i].split("-")[0]);
					int position2 = Integer.parseInt(temp[i].split("-")[1]);
					String a = set[position1];
					set[position1] = set[position2];
					set[position2] = a;

				}
			}
			else{
				int position1 = Integer.parseInt(swapper.split("-")[0]);
				int position2 = Integer.parseInt(swapper.split("-")[1]);
				String a = set[position1];
				set[position1] = set[position2];
				set[position2] = a;
			}
			for (int j = 0; j < set.length; j++) {
				System.out.print(set[j] + " ");
			}
			System.out.println();
		}
	}
}
