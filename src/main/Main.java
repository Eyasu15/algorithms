package main;

import java.util.Arrays;

import counting.CountingSort;
import quick.QuickSort;

public class Main {

	public static void main(String[] args) {
//		int[] nums = { 4, 3, 2, 1 };
//		
//		Sorter sort = new QuickSort();
//		sort.sort(nums);
//		System.out.println(Arrays.toString(nums));
		
		int[] arr = {12, 15, 19, 18, 12, 18, 17, 20, 14, 13};
		var count = new CountingSort();
		count.sort(arr, 10, 20);
		System.out.println(Arrays.toString(arr));
	}
	

}
