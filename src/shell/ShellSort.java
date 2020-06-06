package shell;

import main.Sorter;

public class ShellSort implements Sorter{

	@Override
	public void sort(int[] nums) {
		
		int gap = nums.length/2;		
		while(gap > 0) {
			for (int i = gap; i < nums.length; i++) {
				int current = nums[i];
				int index = i;
				
				while(index - gap >= 0 && current < nums[index-gap]) {
						nums[index] = nums[index-gap];
						index = i-gap;
						
				}
				nums[index] = current;
			}
			gap /= 2; 
		}
		
	}

}
