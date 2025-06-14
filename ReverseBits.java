public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        System.out.println(n);
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(n));
        System.out.println(binary.toString());
        String binaryAsString = binary.toString(); 
        StringBuilder reversed = new StringBuilder();
        for(int i = 0; i < binaryAsString.length(); i++) {
            if(binaryAsString.charAt(i) == '1') {
                reversed.append('0');
            } else {
                reversed.append('1');
            }
        }
        System.out.println(reversed.toString());
        int answer = Integer.parseInt(reversed.toString(),2);
        return answer;
    }
}