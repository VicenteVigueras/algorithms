    /* 
    Problem: Leetcode 1; Difficulty Easy
    Time-complexity: O(n)
    Space-complexity: O(n) 
    */ 

class TwoSum {
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

    /* 
    Can this be better?
    According to AI this can be better by sorting and using 2 pointers
    TODO: Implement sort and 2 pointers method
    */ 
