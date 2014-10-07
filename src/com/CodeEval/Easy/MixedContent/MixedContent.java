package com.CodeEval.Easy.MixedContent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MixedContent {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";
		while ((str = br.readLine()) != null) {

			List<Integer> integer = new ArrayList<Integer>();
			List<String> string = new ArrayList<String>();

			String newStr[] = str.split(",");
			for (int i = 0; i < newStr.length; i++) {

				for (int j = 0; j < newStr[i].length(); j++) {
					if ((newStr[i].charAt(j) >= 'A' && newStr[i].charAt(j) <= 'Z')
							|| (newStr[i].charAt(j) >= 'a' && newStr[i]
									.charAt(j) <= 'z')) {
						string.add(newStr[i]);
						break;
					} else {
						integer.add(Integer.parseInt(newStr[i]));
						break;
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for (String s : string) {
				sb.append(s).append(",");
			}
			if(sb.length()>1){
				sb.deleteCharAt(sb.length() - 1);
			}
			if (integer.size() > 0&&string.size()>0) {
				sb.append("|");
				for (Integer i : integer) {
					sb.append(i).append(",");
				}
			}
			if(!(integer.size() > 0&&string.size()>0)){
				for (Integer i : integer) {
					sb.append(i).append(",");
				}
			}
			if(sb.length()>1){
				sb.deleteCharAt(sb.length() - 1);
			}
			System.out.println(sb);
		}
	}
}
