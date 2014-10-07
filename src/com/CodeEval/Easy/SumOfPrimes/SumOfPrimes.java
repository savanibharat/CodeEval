package com.CodeEval.Easy.SumOfPrimes;

import java.util.ArrayList;
import java.util.BitSet;

class SumOfPrimes {
	private BitSet sieve;
	static int iter = 0;

	private SumOfPrimes() {
	}

	private SumOfPrimes(int size) {
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
		SumOfPrimes sieve = new SumOfPrimes(max + 1); // +1 to include max
														// itself
		for (int i = 3; i * i <= max; i += 2) {
			if (sieve.is_composite(i)) {
				iter++;
				continue;
			}
			// http://www.ams.org/journals/mcom/2004-73-246/S0025-5718-03-01501-1/S0025-5718-03-01501-1.pdf
			// We increment by 2*i to skip even multiples of i
			for (int multiple_i = i * i; multiple_i <= max; multiple_i += 2 * i) {
				sieve.set_composite(multiple_i);
				iter++;
			}
		}
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int count = 1;
		if (count != 999) {
			for (int i = 3; i <= max; i += 2) {
				if (!sieve.is_composite(i)) {
					primes.add(i);
					count++;
				}
				iter++;
			}
		}
		System.out.println("count is"+count);
		return primes;
	}

	public static void main(String[] args) {

		ArrayList<Integer> answer = sieve_of_eratosthenes(7920);
		int sum = 0;
		for (Integer i : answer) {
			sum += i;
		}
		System.out.println("sum is "+sum);
		// System.out.println(iter);
	}
}