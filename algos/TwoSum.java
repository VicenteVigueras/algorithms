package algos;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
 public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> complementByIndex = new HashMap<>();
    for(int i =0; i < nums.length; i++) {
        int complement = target - nums[i];
        if(complementByIndex.containsKey(complement)) {
            return new int[] {complementByIndex.get(complement), i};
        }
        complementByIndex.put(nums[i], i);
    }
    return new int[] {};
 }   
}
