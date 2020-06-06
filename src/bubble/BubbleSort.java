package bubble;

import main.Sorter;

public class BubbleSort implements Sorter{

	@Override
	public void sort(int[] nums) {
		
		for(int lastSortedIndex = nums.length-1 ; 
				lastSortedIndex > 0 ; lastSortedIndex--) 
			
			for (int i = 0 ; i < lastSortedIndex; i++)
				if(nums[i] > nums[i+1])
					swap(nums, i, i+1);
			
		
	}
	
	private void swap(int[] nums, int index1, int index2) {
		
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}
