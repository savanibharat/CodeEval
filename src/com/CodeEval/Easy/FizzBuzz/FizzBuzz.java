package com.CodeEval.Easy.FizzBuzz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FizzBuzz {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if (br != null) {

			String str = "";
			try {
				while ((str = br.readLine()) != null) {

					String newStr[] = str.split(" ");
					int fizz=Integer.parseInt(newStr[0]);
					int buzz=Integer.parseInt(newStr[1]);
					int length=Integer.parseInt(newStr[2]);
					StringBuilder sb=new StringBuilder();

					for (int i = 1; i <= length; i++) {
						if(i%fizz==0&&i%buzz==0){
							sb.append("FB"+" ");
							continue;
						}
						if(i%fizz==0){
							sb.append("F"+" ");
							continue;
						}
						if(i%buzz==0){
							sb.append("B"+" ");
							continue;
						}
						sb.append(i+" ");
					}
					sb.deleteCharAt(sb.length()-1);
					System.out.println(sb);
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
