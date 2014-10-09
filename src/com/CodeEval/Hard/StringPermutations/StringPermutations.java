package com.CodeEval.Hard.StringPermutations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class StringPermutations {

	public static ArrayList<String> PermutationFinder(String s) {
		ArrayList<String> perm = new ArrayList<String>();
		if (s == null) { // error case
			return null;
		} else if (s.length() == 0) {

			perm.add(""); // initial
			return perm;

		}
		char initial = s.charAt(0); // first character
		String rem = s.substring(1); // Full string without first character

		// System.out.println("rem ="+rem);

		ArrayList<String> words = PermutationFinder(rem);
		for (String str : words) {
			for (int i = 0; i <= str.length(); i++) {
				perm.add(charinsert(str, initial, i));
			}
		}
		return perm;
	}

	public static String charinsert(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;
	}

	static BufferedReader getBufferedReader(String path) {

		try {
			return new BufferedReader(new FileReader(new File(path)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br=getBufferedReader(path);
		if(br!=null){
			String str="";
			try {
				while((str=br.readLine())!=null){
					
					ArrayList<String> value = PermutationFinder(str);
					TreeSet<String> values = new TreeSet<String>(value);
					StringBuilder sb=new StringBuilder();
					
					
					Iterator<String> iter=values.iterator();
					while(iter.hasNext())
						sb.append(iter.next()+",");
					
					sb.deleteCharAt(sb.length()-1);
					System.out.println(sb.toString());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}