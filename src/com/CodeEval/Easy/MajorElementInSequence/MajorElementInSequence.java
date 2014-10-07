package com.CodeEval.Easy.MajorElementInSequence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class MajorElementInSequence {
	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if (br != null) {
			
			String str = "";
			try {
				
				while ((str = br.readLine()) != null) {
					boolean isPrintable=false;
					
					String newStr[] = str.split(",");
					HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
					for (int i = 0; i < newStr.length; i++) {
						if(map.containsKey(Integer.parseInt(newStr[i]))){
							map.put(Integer.parseInt(newStr[i]), map.get(Integer.parseInt(newStr[i]))+1);
						}
						else{
							map.put(Integer.parseInt(newStr[i]),1);
						}
					}
					StringBuilder sb=new StringBuilder();
					for(Entry<Integer, Integer> mapper:map.entrySet()){
						if(mapper.getValue()>(newStr.length/2)){
							sb.append(mapper.getKey()).append(" ");
							isPrintable=true;
						}
					}
					if(isPrintable){
						sb.deleteCharAt(sb.length()-1);
						System.out.println(sb.toString());
					}
					if(!isPrintable){
						System.out.println("None");
					}
					
					
					/*int max = findMax(newStr);
					int[] a = new int[max + 1];
					for (int i = 0; i < newStr.length; i++) {
						a[Integer.parseInt(newStr[i])]++;
					}
					StringBuilder sb=new StringBuilder();
					for (int i = 0; i < a.length; i++) {
						if (a[i] > newStr.length/2) {
							sb.append(i).append(" ");
							isPrintable=true;
						}
					}
					if(isPrintable){
						sb.deleteCharAt(sb.length()-1);
						System.out.println(sb.toString());
					}
					if(!isPrintable){
						System.out.print("None");
					}*/
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static int findMax(String newStr[]) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < newStr.length; i++) {
			if (max < Integer.parseInt(newStr[i])) {
				max = Integer.parseInt(newStr[i]);
			}
		}
		return max;
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
