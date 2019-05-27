package _01_10;

import java.util.HashMap;

public class _01TowSum {

	public int[] towSum(int[] nums, int target) {
		
		int[] indexs = new int[2];
		
		HashMap hashmap = new HashMap();
	
		for(int i = 0;i<nums.length;i++) {
			hashmap.put(nums[i], i);
		}
		
		for(int j = 0;j<nums.length;j++) {
			
			int rest = target - nums[j];
			
			if(hashmap.containsKey(rest)&&rest!=nums[j]) {
				//cat not be the same number
				indexs[0]=j;
				indexs[1]=(int)hashmap.get(rest);
//				must return for in case of the second result
				break;
			}
			
		}
		
		return indexs;
	}
	
	public static void main(String[] args) {
		
//		int[] nums = {2,7,11,15};
		//int target = 9;
		int[] nums = {3,2,4};
		int target = 6;
		
		_01TowSum _01TowSums = new _01TowSum();
		
		int[] indexs = _01TowSums.towSum(nums,target);
		
		System.out.println(indexs[0]);
		System.out.println(indexs[1]);
		
	}
	
	
}
