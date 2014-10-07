package com.CodeEval.Easy.SortNumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class SortNumbers {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if(br!=null){
			
			String str="";
			try {
				while((str=br.readLine())!=null){
					
					String newStr[]=str.split(" ");
					ArrayList<Double> list=new ArrayList<Double>();
					for (int i = 0; i < newStr.length; i++) {
						list.add(Double.parseDouble(newStr[i]));
					}
					Arrays.sort(list.toArray());
					StringBuilder sb=new StringBuilder();
					for(Double l:list){
						sb.append(l+" ");
					}
					sb.deleteCharAt(sb.length()-1);
					System.out.println(sb);
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