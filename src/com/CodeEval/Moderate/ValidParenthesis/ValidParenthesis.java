package com.CodeEval.Moderate.ValidParenthesis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {

		String path=args[0];
		BufferedReader br=getBufferedReader(path);
		if(br!=null){
			
			String str="";
			try {
				while((str=br.readLine())!=null){
					
					String isParenthesisValid=parenthesisCheck(str);
					System.out.println(isParenthesisValid);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static String parenthesisCheck(String input) {
		int stackSize = input.length();
		Stack<Character> theStack = new Stack<Character>();

		for (int j = 0; j < input.length(); j++) {

			char ch = input.charAt(j);
			switch (ch) {

			case '{':
			case '[':
			case '(':
				theStack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if (!theStack.isEmpty()) {

					char chx = theStack.pop();
					if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
							|| (ch == ')' && chx != '(')) {

						// System.out.println("nice one no err");

						return "False";

					}
				} else
					// prematurely empty[
					
					return "False";
				break;
			default:
				break;
			}
		}
		// at this point all characters are processed
		if (!theStack.isEmpty()) {

			return "False";

		}
		return "True";
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
