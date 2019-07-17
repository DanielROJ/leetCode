package LeetCode;

public class SortedArray {

	
	
	public int find(int[] num , int tar) {
		
		
		for (int i = 0; i < num.length; i++) {
			if(tar == num[i]) {
				return i;
			}
		}
			
	return -1;
	
	}
	
	
	
	
	
	
	
}
