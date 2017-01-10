package interview;

import java.util.HashMap;
import java.util.Map;

public class FindNumber {

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int one = target - nums[i];
			if (map.containsKey(one)) {
				return new int[] { map.get(one), i };
			}
			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("next to");
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15, 16 };
		int target = 13;

		new FindNumber().twoSum(arr, target);
	}

}
