package com.CodeEval.Easy.RightMostChar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RightMostChar {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			if(str.length()==0){
				continue;
			}
			String newStr[]=str.split(",");
			String key=newStr[1];
			char ch=key.charAt(0);
			int position=-1;
			for (int i = 0; i < newStr[0].length(); i++) {
				if(newStr[0].charAt(i)==ch){
					position=i;
				}
			}
			System.out.println(position);
		}
		
	}
}
