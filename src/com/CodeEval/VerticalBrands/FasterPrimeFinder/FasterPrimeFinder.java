package com.CodeEval.VerticalBrands.FasterPrimeFinder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedList;

public class FasterPrimeFinder {

	private BitSet sieve;
	static int iter = 0;

	private FasterPrimeFinder(int size) {
		sieve = new BitSet((size + 1) / 2);
	}

	private boolean is_composite(int k) {
		assert k >= 3 && (k % 2) == 1;
		return sieve.get((k - 3) / 2);
	}

	private void set_composite(int k) {
		assert k >= 3 && (k % 2) == 1;
		sieve.set((k - 3) / 2);
	}

	public static ArrayList<Integer> sieve_of_eratosthenes(int max) {
		FasterPrimeFinder sieve = new FasterPrimeFinder(max + 1); // +1 to
																	// include
																	// max
																	// itself
		for (int i = 3; i * i <= max; i += 2) {
			if (sieve.is_composite(i)) {
				continue;
			}

			// We increment by 2*i to skip even multiples of i
			for (int multiple_i = i * i; multiple_i <= max; multiple_i += 2 * i) {
				sieve.set_composite(multiple_i);
			}
		}
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for (int i = 3; i <= max; i += 2) {
			if (!sieve.is_composite(i)) {
				primes.add(i);
			}
		}
		return primes;
	}

	public static void main(String[] args) throws Exception {

		String path = args[0];
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String str = "";
		while ((str = br.readLine()) != null) {

			if(Integer.parseInt(str)==0){
				continue;
			}
			else if(Integer.parseInt(str)==1){
				continue;
			}
			else if(Integer.parseInt(str)==2){
				System.out.println("2");
			}
			else{
			ArrayList<Integer> answer = sieve_of_eratosthenes(Integer
					.parseInt(str));
			for (int i = 0; i < answer.size(); i++) {

				System.out.print(answer.get(i));
				if (i + 1 != answer.size()) {
					System.out.print(",");
				}
			}
			System.out.println();
			}
		}
	}
}