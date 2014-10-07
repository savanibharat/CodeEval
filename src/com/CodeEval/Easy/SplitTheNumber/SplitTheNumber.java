package com.CodeEval.Easy.SplitTheNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SplitTheNumber {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {

			String number = str.split(" ")[0];
			String substitution = str.split(" ")[1];
			int sum=0;
			if(substitution.indexOf("+")!=-1){
				int index=substitution.indexOf("+");
				int firstHalf=Integer.parseInt(number.substring(0,index));
				int secondHalf=Integer.parseInt(number.substring(index));
				sum=firstHalf+secondHalf;
			}
			else{
				int index=substitution.indexOf("-");
				int firstHalf=Integer.parseInt(number.substring(0,index));
				int secondHalf=Integer.parseInt(number.substring(index));
				sum=firstHalf-secondHalf;
			}
			System.out.println(sum);
		}
	}
}
