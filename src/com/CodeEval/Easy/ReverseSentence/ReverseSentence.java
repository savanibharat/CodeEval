package com.CodeEval.Easy.ReverseSentence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReverseSentence {

	public static void main(String[] args) throws Exception {
		
		String path=args[0];
		BufferedReader br=new BufferedReader(new FileReader(new File(path)));
		String str="";
		while((str=br.readLine())!=null){
			
			String sb[]=str.split(" ");
			String s="";
			StringBuilder revStr = new StringBuilder();
			for (int i = sb.length-1; i >=0 ; i--) {
				
				revStr.append(sb[i]+" ");
			}
			revStr.deleteCharAt(revStr.length()-1);
			System.out.println(revStr);
		}
		
	}
}
