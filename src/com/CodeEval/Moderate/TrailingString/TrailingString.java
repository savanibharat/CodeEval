package com.CodeEval.Moderate.TrailingString;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TrailingString {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			
			String element=str.split(",")[1].trim();
			String sentence=str.split(",")[0].trim();
			if(element.length()>sentence.length()){
				System.out.println(0);
			}
			else{
				if(sentence.contains(element)){
					System.out.println(1);
				}
				else{
					System.out.println(0);
				}
			}
			
		}
	}
	
}
