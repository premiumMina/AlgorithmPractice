package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNumber {

	public void twoSum(int[] nums, int target) {

		List<Integer> result = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int one = nums[i];
			if (map.containsKey(target - one)) {
				// 중복되지 않도록
				if (!result.contains(target - one) && !result.contains(i)) {
					result.add(i);
					result.add(map.get(target - one));
				}
			}
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15, 6 };
		int target = 13;

		new FindNumber().twoSum(arr, target);
	}

}
