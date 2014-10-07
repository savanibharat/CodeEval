package com.CodeEval.Easy.SetOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(
				new FileReader(new File(args[0])));
		String str = "";

		while ((str = br.readLine()) != null) {
			Set<Integer> arr1 = new HashSet<>();
			Set<Integer> arr2 = new HashSet<>();
			
			String a = str.split(";")[0];
			String b = str.split(";")[1];

			String[] setA = a.split(",");
			for (int i = 0; i < setA.length; i++) {
				arr1.add(Integer.parseInt(setA[i]));
			}
			String[] setB = b.split(",");
			for (int i = 0; i < setB.length; i++) {
				arr2.add(Integer.parseInt(setB[i]));
			}
			StringBuilder sb=new StringBuilder();
			for(Integer i:arr1){
				if(arr2.contains(i)){
					sb.append(i);
				}
			}
			if(sb.length()==1){
				System.out.println(sb);
			}
			if(sb.length()==0){
				System.out.println();
			}
			if(sb.length()>1){
				StringBuilder newSb=new StringBuilder();
				String s="";
				for (int i = 0; i < sb.length(); i++) {
					newSb.append(sb.charAt(i)).append(",");
				}
				s=newSb.deleteCharAt(newSb.length()-1).toString();
				System.out.println(s);
			}
			
			
			
		}
	}
}
