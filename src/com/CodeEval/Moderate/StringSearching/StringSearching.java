package com.CodeEval.Moderate.StringSearching;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StringSearching {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			
			String input=str.split(",")[0];
			String checker=str.split(",")[1];
			if(input.contains(checker)){
				System.out.println("true");
			}
			else{
				//CodeEval,C*Eval
				for (int i = 0; i < input.length(); i++) {
					
				}
			}
		}
	}
}
