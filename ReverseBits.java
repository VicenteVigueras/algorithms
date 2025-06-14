    /* 
    Problem: Leetcode 190; Difficulty Easy
    Time-complexity: O(1)
    Space-complexity: O(1) 
    */ 

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        StringBuilder binary = new StringBuilder(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        binary = binary.reverse();
        var answer = (int) Long.parseLong(binary.toString(),2);
        return  answer;
    }
}

   /* 
   Although O(1) for time and space, BigO tells us about scalability, not absolute speed/space.
   Therefore using bitwise operators will be much faster
   TODO: Implement bitwise solution 
   */