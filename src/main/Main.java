package main;

import java.util.Arrays;

import merge.MergeSort;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 1 };
		Sorter sort = new MergeSort();
		sort.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
	

}
