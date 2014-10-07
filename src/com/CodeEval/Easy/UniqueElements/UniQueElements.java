package com.CodeEval.Easy.UniqueElements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashSet;

public class UniQueElements {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			
			String newStr[]=str.split(",");
			LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
			for (int i = 0; i < newStr.length; i++) {
				set.add(Integer.parseInt(newStr[i]));
			}
			StringBuilder sb=new StringBuilder();
			for (Integer integer : set) {
				sb.append(integer+",");
			}
			sb.deleteCharAt(sb.length()-1);
			System.out.println(sb);
		}
		
	}
}
