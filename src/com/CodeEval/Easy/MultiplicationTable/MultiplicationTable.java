package com.CodeEval.Easy.MultiplicationTable;

public class MultiplicationTable {

	public static void main(String[] args) {

		for (int i = 1; i <= 12; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j <= 12; j++) {
				
				if ((i*j)<10) {
					sb.append((i * j) + "   ");
				}
				if((i*j)>9&&(i*j)<200)
					sb.append((i * j) + "  ");
				if((i*j)>99)
					sb.append((i * j) + " ");
				 if(j==12) {
					sb.append((i * j));
				}
			}
			System.out.println(sb);
		}

	}

}
