package com.CodeEval.Easy.LowestUniqueNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LowestUniqueNumber {

	public static void main(String[] args) {

		String path = args[0];
		BufferedReader br = getBufferedReader(path);
		if (br != null) {

			String str = "";
			try {
				while ((str = br.readLine()) != null) {
					boolean isPrinted=false;
					String newStr[] = str.split(" ");
					int a[] = new int[newStr.length];
					for (int i = 0; i < newStr.length; i++) {
						a[Integer.parseInt(newStr[i])]++;
					}
					for (int i = 0; i < a.length; i++) {
						if(a[i]!=1)
							continue;
						if(a[i]==1){
							for (int j = 0; j < newStr.length; j++) {
								isPrinted=true;
								if(newStr[j].equals(Integer.toString(i)))
									System.out.println(j+1);
							}
							break;
						}
					}
					if(!isPrinted){
						System.out.println("0");
						isPrinted=true;
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
