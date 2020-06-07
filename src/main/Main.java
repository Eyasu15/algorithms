package main;

import java.util.Arrays;

import quick.QuickSort;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 1 };
		
		Sorter sort = new QuickSort();
		sort.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
	

}
