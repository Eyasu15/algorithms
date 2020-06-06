package selection;

import main.Sorter;

public class SelectionSort implements Sorter{

	@Override
	public void sort(int[] nums) {
		
		int largestIndex = 0;
		
		int lastSortedIndex = nums.length-1;
		
		for(; lastSortedIndex > 0 ; lastSortedIndex--) {
			for(int i = 0; i <= lastSortedIndex; i++) {
				if(nums[i] > nums[largestIndex]) {
					largestIndex = i;
				}
			}	
			swap(nums, largestIndex, lastSortedIndex);
			largestIndex = 0; 
		}
	}
	
	public void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}
 