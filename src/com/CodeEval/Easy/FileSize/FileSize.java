package com.CodeEval.Easy.FileSize;

import java.io.File;

public class FileSize {
	public static void main(String[] args) {
		System.out.println(new File(args[0]).length());
	}
}
