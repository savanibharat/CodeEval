package com.CodeEval.Moderate.ShortestRepition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ShortestRepition {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			
			int a=getPeriod(str);
			if(a>0){
				System.out.println(a);
			}
			else{
				System.out.println(str.length());
			}
		}
		
	}
	public static int getPeriod(String str) {
	    int len = str.length();
	    int i;

	    for (i = 1; i <= len/2; i++) {
	        String period = str.substring(0, i);
	        String tmp = str;
	        boolean flag = true;

	        while (flag && tmp.length() > 0) {
	            if (tmp.startsWith(period)) {
	                tmp = tmp.substring(i);
	            } else {
	                flag = false;
	            }
	        }

	        if (flag == true) {
	            return i;
	        }
	    }
	    return 0;
	}
	
}
