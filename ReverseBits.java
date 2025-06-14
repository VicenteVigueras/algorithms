// runs on O(1) time and space, however BigO tells us about scalability, not absolute speed/space
// therefore reversing bits with bitwise operators will still be much faster
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        StringBuilder binary = new StringBuilder(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        binary = binary.reverse();
        var answer = (int) Long.parseLong(binary.toString(),2);
        return  answer;
    }
}
 //TODO: Implement bitwise solution