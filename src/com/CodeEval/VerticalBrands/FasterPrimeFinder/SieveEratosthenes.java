package com.CodeEval.VerticalBrands.FasterPrimeFinder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SieveEratosthenes {

	public static void main(String[] args) throws Exception {
		String path = args[0];
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String str = "";
		while ((str = br.readLine()) != null) {

			if (Integer.parseInt(str) < 2) {
				continue;
			} else if (Integer.parseInt(str) == 1) {
				continue;
			} else if (Integer.parseInt(str) == 2) {
				System.out.println("2");
			} else
				getPrimeArray(Integer.parseInt(str));
		}
	}

	public static void getPrimeArray(int limit) {
		boolean[] sieve = new boolean[limit + 1];
		List<Integer> primes = new ArrayList<Integer>(limit + 1);
		int p = 2;
		while (p * p <= limit) {
			sieve[p * p] = true;
			int multiple = p * p;
			while (multiple <= limit) {
				sieve[multiple] = true;
				multiple += p;
			}
			for (int i = p + 1; i <= limit; i++) {
				if (!sieve[i]) {
					p = i;
					break;
				}
			}
		}
		for (int i = 2; i <= limit; i++) {
			if (!sieve[i]) {
				primes.add(i);
			}
		}
		for (int i = 0; i < primes.size(); i++) {

			System.out.print(primes.get(i));
			if (i + 1 != primes.size()) {
				System.out.print(",");
			}
		}
		System.out.println();
	}
}