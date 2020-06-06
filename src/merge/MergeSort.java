package merge;

import main.Sorter;

public class MergeSort implements Sorter{

	@Override
	public void sort(int[] nums) {
		mergeSort(nums,0, nums.length);
	}
	
	private void mergeSort(int[] nums, int start, int end) {

		if(end - start < 2) 
			return;
		
		int mid = (start + end) / 2;
		mergeSort(nums, start, mid);
		mergeSort(nums, mid, end);
		
		merge(nums, start, mid, end);
	}
	
	private void merge(int[] nums, int start, int mid, int end) {
		if(nums[mid-1] <= nums[mid])
			return;
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] temp = new int[end-start];
		
		while(i < mid && j < end)
			temp[tempIndex++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];

		System.arraycopy(nums, i, nums, i+tempIndex, mid-i);
		System.arraycopy(temp, 0, nums, start, tempIndex);
	
	}
}