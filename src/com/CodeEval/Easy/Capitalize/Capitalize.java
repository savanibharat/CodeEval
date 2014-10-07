package CodeEval.Easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Capitalize {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		String str = "";

		while ((str = br.readLine()) != null) {
			
			String[] arg=str.split(" ");
			for (int i = 0; i < arg.length; i++) {
				System.out.print(Character.toUpperCase(arg[i].charAt(0))+arg[i].substring(1)+" ");  
			}
			System.out.println();
		}

	}
}
