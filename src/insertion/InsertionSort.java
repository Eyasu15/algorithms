package insertion;

import main.Sorter;

public class InsertionSort implements Sorter{

	@Override
	public void sort(int[] nums) {
		
		for (int firstUnsortedIndex = 1;
					firstUnsortedIndex < nums.length; 
					firstUnsortedIndex++) {
			
			int currentNum = nums[firstUnsortedIndex];
			
			int i;
			for(i = firstUnsortedIndex; 
					i > 0 && nums[i-1] > currentNum; i--) {

				nums[i] = nums[i-1];
			}
			nums[i] = currentNum;
		}
		
	}
}
