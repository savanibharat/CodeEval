package com.CodeEval.Moderate.ReverseGroups;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReverseGroups {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {
			int end=Integer.parseInt(str.split(";")[1]);
			String[] elements=str.split(";")[0].split(",");
			List<String> arr=new ArrayList<String>();
			for (int i = 0; i < elements.length; i++) {
				arr.add(elements[i]);
			}
			System.out.println(arr);
			for (int i = 0; i < end-1; i++) {
				
				String t=arr.get(i);
				arr.add(arr.get(i));
				
			}
		}
	}
}
