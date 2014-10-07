package com.CodeEval.Easy.MultiplesOfNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MultiplesOfNumber {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine()) != null){
			int limit=Integer.parseInt(str.split(",")[0]);
			int element=Integer.parseInt(str.split(",")[1]);
			
			for (int i = element; ; i+=element) {
				if(i>=limit){
					System.out.println(i);
					break;
				}
			}
		}
	}
}
