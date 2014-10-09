package com.CodeEval.Moderate.MthToLastElement;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MthToLastElement {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			System.out.println(getMthToLastElement(str));
		}
	}
	public static String getMthToLastElement(String str){
		String[] temp=str.split(" ");
		if(Integer.parseInt(temp[temp.length-1])<temp.length)
		return temp[temp.length-Integer.parseInt(temp[temp.length-1])-1];
		return "";
	}
}
