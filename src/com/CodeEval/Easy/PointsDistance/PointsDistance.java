package com.CodeEval.Easy.PointsDistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PointsDistance {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			
			System.out.println(str.replaceAll(" ", ""));
		}
	}
}
