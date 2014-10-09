package com.CodeEval.Moderate.CompressedSequence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CompressedSequence {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			String split[]=str.split(" ");
			int temp=1;
			int previous=Integer.parseInt(split[0]);
			String answer="";
			for (int i = 1; i < split.length; i++) {
				
				int num=Integer.parseInt(split[i]);
				if(previous!=num){
					answer+=temp+" "+previous+" ";
					previous=num;
					temp=1;
				}
				else{
					temp++;
				}
			}
			answer += temp + " " + previous; 
			System.out.println(answer);
			
		}
	}
}
