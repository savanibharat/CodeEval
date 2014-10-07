package com.CodeEval.Easy.MultiplyLists;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MultiplyLists {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if(br!=null){
			
			String str="";
			try {
				while((str=br.readLine())!=null){
					
					String newStr[]=str.split(" \\| ");
					Object a[]=fillInArray(newStr[0]);
					Object b[]=fillInArray(newStr[1]);
					StringBuilder sb=new StringBuilder();
					for(int i=0,j=0;i<a.length;i++,j++){
						sb.append((int)(a[i])*(int)(b[i])).append(" ");
					}
					sb.deleteCharAt(sb.length()-1);
					System.out.print(sb);
					System.out.println();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	static Object[] fillInArray(String newStr){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		String[] str=newStr.split(" ");
		for (int i = 0; i < str.length; i++) {
			arr.add(Integer.parseInt(str[i]));
		}
		return arr.toArray();
		
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
