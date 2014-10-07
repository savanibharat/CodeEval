package com.CodeEval.Easy.SwapCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SwapCase {

	public static void main(String[] args) {
		
		String path=args[0];
		BufferedReader br=getBufferedReader(path);
		if(br!=null){
			
			String str="";
			try {
				while((str=br.readLine())!=null){
					StringBuilder myStr=new StringBuilder();
					for (int i = 0; i < str.length(); i++) {
						
						if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
							myStr.append((char)(str.charAt(i)-'A'+'a'));
							continue;
						}
						if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
							myStr.append((char)(str.charAt(i)-'a'+'A'));
							continue;
						}
						myStr.append((char)str.charAt(i));
					}
					System.out.println(myStr);
					myStr.delete(0, myStr.length());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	static BufferedReader getBufferedReader(String path) {

		try {
			return new BufferedReader(new FileReader(new File(path)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
