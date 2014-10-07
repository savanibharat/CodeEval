package com.CodeEval.Easy.ToLowerCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ToLowerCase {

	public static void main(String[] args) throws Exception {
		
		String path=args[0];
		BufferedReader br=new BufferedReader(new FileReader(new File(path)));
		String str="";
		
		while((str=br.readLine())!=null){
			String newStr="";
			for (int i = 0; i < str.length(); i++) {
				
				if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
					newStr+=(char)(str.charAt(i)-'A'+'a');
				}
				else{
					newStr+=str.charAt(i);
				}
			}
			System.out.println(newStr);
		}
	}
	
}
