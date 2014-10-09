package com.CodeEval.Moderate.Pangrams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pangrams {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if (br != null) {

			String str = "";
			try {
				
				while ((str = br.readLine()) != null) {
					boolean isPrinted=false;
					boolean b[]=new boolean[256];
					String aaa=str.replaceAll("[^ a-zA-Z0-9 ]+","");
					String aa=aaa.replaceAll(" ", "");
					String s = aa.toLowerCase();
					char[] newStr = s.toCharArray();
					for (int i = 0; i < newStr.length; i++) {
						b[newStr[i]]=true;
					}
					for (int i = 97; i <=122; i++) {
						if(!b[i]){
							System.out.print((char)i);
							isPrinted=true;
						}
					}
					if(!isPrinted){
						System.out.println("NULL");
					}
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
