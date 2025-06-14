    /* 
    Problem: Leetcode 268; Difficulty Easy
    Time-complexity: O(log n)
    Space-complexity: O(n * log(n)) 
    */ 
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
           if(nums[i] != i) {
            return i;
           }
        }
        return nums.length;
    }
}
    /*
    Can it be better?
    Yes, this is generally solved in O(n) time and O(1) space
    TODO: Figure out how to improve it
    */