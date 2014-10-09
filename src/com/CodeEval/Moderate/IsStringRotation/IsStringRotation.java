package com.CodeEval.Moderate.IsStringRotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IsStringRotation {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if(br!=null){
			
			String str="";
			try {
				while((str=br.readLine())!=null){
					
					String newStr[]=str.split(",");
					String input=newStr[0];
					String output=newStr[1];
					boolean isRotated = false;
					for (int i = 0; i < input.length(); i++) {

						String rotatedString = input.substring(i) + input.substring(0, i);
						if (rotatedString.equals(output)) {
							isRotated=true;
						}
					}
					if(isRotated){
						System.out.println("True");
					}
					else{
						System.out.println("False");
					}
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}