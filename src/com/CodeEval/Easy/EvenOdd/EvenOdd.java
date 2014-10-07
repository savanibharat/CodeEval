package com.CodeEval.Easy.EvenOdd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EvenOdd {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			
			if((Integer.parseInt(str)&1)==0)
				System.out.print("1");
			else
				System.out.print("0");
			System.out.println();
		}
	}
}
