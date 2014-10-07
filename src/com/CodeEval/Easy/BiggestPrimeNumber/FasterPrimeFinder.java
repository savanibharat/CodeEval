package com.CodeEval.Easy.BiggestPrimeNumber;

import java.util.ArrayList;
import java.util.BitSet;

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
		FasterPrimeFinder sieve = new FasterPrimeFinder(max + 1); // +1 to include max
										// itself
		for (int i = 3; i * i <= max; i += 2) {
			if (sieve.is_composite(i)) {
				iter++;
				continue;
			}
			
			// We increment by 2*i to skip even multiples of i
			for (int multiple_i = i * i; multiple_i <= max; multiple_i += 2 * i) {
				sieve.set_composite(multiple_i);
				iter++;
			}
		}
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for (int i = 3; i <= max; i += 2) {
			if (!sieve.is_composite(i)) {
				primes.add(i);
				iter++;
			}
		}
		System.out.println(primes.get(primes.size() - 1));
		return primes;
	}

	public static void main(String[] args) {

		ArrayList<Integer> answer = sieve_of_eratosthenes(100);
		System.out.println(iter);
	}
}