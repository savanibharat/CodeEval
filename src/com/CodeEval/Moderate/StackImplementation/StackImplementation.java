package com.CodeEval.Moderate.StackImplementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if (br != null) {

			String str = "";
			try {
				while ((str = br.readLine()) != null) {

					boolean isNumber = true;
					for (int i = 0; i < str.length(); i++) {
						if (str.charAt(i) < 48 || str.charAt(i) > 58) {
							isNumber = false;
							continue;
						}
					}
					if (isNumber) {
						String newStr[] = str.split(" ");
						Stack<Integer> list = new Stack<Integer>();
						for (int i = 0; i < newStr.length; i++) {
							list.push(Integer.parseInt(newStr[i]));
						}
						StringBuilder sb = new StringBuilder();
						for (int i = 0; i < list.size(); i++) {
							if (i != list.size() - i) {
								System.out.print(list.pop() + " ");
								list.pop();
							}
						}
						System.out.println();
						sb.deleteCharAt(sb.length() - 1);
						System.out.println(sb);
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
			e.printStackTrace();
		}
		return null;
	}

}
