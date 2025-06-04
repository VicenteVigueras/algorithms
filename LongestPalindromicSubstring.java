class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        List<String> palindromes = new ArrayList<>();
        String longest = "";
        for(int i =0; i < s.length(); i++) {
          for(int j = i+1; j < s.length(); j++) {
                String possible = s.substring(i,j+1);
            if (isPalindrome(possible) && possible.length() > longest.length()) {
                    longest = possible;
                }
          }
        }
        if(longest.equals("")) {
            return longest += s.charAt(0);
        }
        return longest;

    }
    public boolean isPalindrome(String s) {
        String answer = "";
        for(int i = s.length()-1; i >= 0; i--) {
            answer += s.charAt(i);
        }
        return s.equals(answer);
    }
}