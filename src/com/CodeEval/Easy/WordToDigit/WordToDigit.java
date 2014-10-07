package com.CodeEval.Easy.WordToDigit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordToDigit {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if (br != null) {
			
			HashMap<String,Integer> map=new HashMap<String,Integer>();
			map.put("zero",0);
			map.put("one",1);
			map.put("two",2);
			map.put("three",3);
			map.put("four",4);
			map.put("five",5);
			map.put("six",6);
			map.put("seven",7);
			map.put("eight",8);
			map.put("nine",9);
			
			String str = "";
			try {
				while ((str = br.readLine()) != null) {

					String newStr[] = str.split(";");
					for (int i = 0; i < newStr.length; i++) {
						System.out.print(map.get(newStr[i]));
					}
					System.out.println();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	static BufferedReader getBufferedReader(String path) {

		try {
			return new BufferedReader(new FileReader(new File(path)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
