package com.CodeEval.Moderate.CalculateDistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateDistance {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
				new FileReader(new File(args[0])));
		String str;

		String PATTERN = "^\\(([\\d-]+), ([\\d-]+)\\) \\(([\\d-]+), ([\\d-]+)\\)$";
		Pattern pattern = Pattern.compile(PATTERN);

		while ((str = in.readLine()) != null) {
			str = str.trim();

			Matcher m = pattern.matcher(str);

			if (m.matches()) {
				int X1 = Integer.parseInt(m.group(1));
				int Y1 = Integer.parseInt(m.group(2));
				int X2 = Integer.parseInt(m.group(3));
				int Y2 = Integer.parseInt(m.group(4));

				int XDIFF = X1 - X2;
				XDIFF *= XDIFF;

				int YDIFF = Y1 - Y2;
				YDIFF *= YDIFF;
				System.out.println((int) Math.sqrt(XDIFF + YDIFF));

			}
		}
	}

}
