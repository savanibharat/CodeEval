package com.CodeEval.Moderate.RemoveCharacters;

import java.io.*;
import java.util.*; 

public class RemoveChars {
    public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null) {
			System.out.println(find(str));
		}
    }
    static String find(String str){
    	String[] mySplit = str.split(",");
		String string = mySplit[0].trim();
		String removeChars = mySplit[1].trim();
		String outputStr = ""; 
		for (int k = 0; k < string.length(); k++) {
			String c = "" + string.charAt(k); 
			if(!removeChars.contains(c)) 
				outputStr += c; 
		}
		return outputStr.trim(); 
    }
}