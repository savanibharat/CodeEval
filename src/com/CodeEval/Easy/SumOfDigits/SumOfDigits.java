package com.CodeEval.Easy.SumOfDigits;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SumOfDigits {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			int remainder=0,sum=0;
			int a=Integer.parseInt(str);
			while(a!=0){
				remainder=a%10;
				sum+=remainder;
				a=a/10;
			}
			System.out.println(sum);
		}
	}
}
