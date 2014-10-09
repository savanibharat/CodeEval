package com.CodeEval.Moderate.FirstNonRepeatingCharacter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if (br != null) {

			String str = "";
			try {
				while ((str = br.readLine()) != null) {

					LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
					for (int i = 0; i < str.length(); i++) {
						
						if(map.containsKey(str.charAt(i))){
							map.put(str.charAt(i), map.get(str.charAt(i))+1);
						}
						else{
							map.put(str.charAt(i), 1);
						}
					}
					for(Map.Entry<Character, Integer>mapper:map.entrySet()){
						
						if(mapper.getValue()==1){
							System.out.println(mapper.getKey());
							break;
						}
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
