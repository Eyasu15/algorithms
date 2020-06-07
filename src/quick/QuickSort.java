package quick;

import main.Sorter;

public class QuickSort implements Sorter, Runnable{

	@Override
	public void sort(int[] nums) {
		quickSort(nums);
	}

	private void quickSort(int[] nums) {
		int start = 0;
		int end = nums.length;
		
		quickSort(nums, start, end);
	}

	private void quickSort(int[] nums, int start, int end) {
		if(end - start < 2)
			return;
		
		int pivot = partition(nums, start, end);
		quickSort(nums, start, pivot);
		quickSort(nums, pivot+1, end);
	}

	private int partition(int[] nums, int start, int end) {

		int pivotValue = nums[start];
		int i = start;
		int j = end;
		
		while(i < j) {
			
			//find element smaller than pivotValue starting from end
			while(i < j && nums[--j] >= pivotValue);
			if(i < j)
				nums[i] = nums[j];
			
			//find element greater than pivotValue starting from start
			while(i < j && nums[++i] <= pivotValue);
			if(i < j)
				nums[j] = nums[i];
			
		}
		nums[j] = pivotValue;
		
		return j;
	}

	@Override
	public void run() {
			
	}

}
