package com.CodeEval.Easy.NextToLastWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class NextToLastWord {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if(br!=null){
			
			String str="";
			try {
				while((str=br.readLine())!=null){
					
					String newStr[]=str.split(" ");
					LinkedList<String> list=new LinkedList<String>();
					for (int i = 0; i < newStr.length; i++) {
						list.add(newStr[i]);
					}
					System.out.println(list.get(list.size()-2));
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
