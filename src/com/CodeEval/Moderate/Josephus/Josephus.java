package com.CodeEval.Moderate.Josephus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Josephus {

	public static int execute(int n, int k) {
		int killIdx = 0;
		ArrayList<Integer> prisoners = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			prisoners.add(i);
		}
		while (prisoners.size() > 1) {
			killIdx = (killIdx + k - 1) % prisoners.size();
			System.out.print(prisoners.get(killIdx) + " ");
			prisoners.remove(killIdx);
		}
		return prisoners.get(0);
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader(new File(args[0])));
		String str="";
		while((str=br.readLine())!=null){
			System.out.println(execute(Integer.parseInt(str.split(",")[0]),Integer.parseInt(str.split(",")[1]))); 
		}
		
	}

}
