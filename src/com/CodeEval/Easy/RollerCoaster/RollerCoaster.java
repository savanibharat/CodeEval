package CodeEval.Easy;

import java.io.BufferedReader;
import java.io.FileReader;

public class RollerCoaster {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		String str = "";
		
		while ((str = br.readLine()) != null) {
			int idx=0;
			StringBuilder sb = new StringBuilder(str);
			StringBuilder newSb = new StringBuilder();
			for (int i = 0; i < sb.length(); i++) {
				
				if (Character.isLetter(sb.charAt(i))) {
					if ((idx & 1) == 1) {
						newSb.append(Character.toLowerCase(sb.charAt(i)));
					} else {
						newSb.append(Character.toUpperCase(sb.charAt(i)));
					}
					idx++;
				}
				else{
					newSb.append(sb.charAt(i));
				}
			}
			System.out.println(newSb);
		}
	}
}
