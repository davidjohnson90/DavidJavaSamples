package com.david.java.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David
 *
 */
public class AutoBoxing {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 1; i < 50; i += 2)
			li.add(i);
		System.out.println(li.toString());
		sumOdd(li);
		sumEven(li);
	}

	public static int sumOdd(List<Integer> li) {
		int sum = 0;
		for (Integer i : li)
			if (i % 2 != 0)
				sum += i;
		System.out.println(sum);
		return sum;
	}

	public static int sumEven(List<Integer> li) {
		int sum = 0;
		for (Integer i : li)
			if (i % 2 == 0)
				sum += i;
		System.out.println(sum);
		return sum;
	}
}