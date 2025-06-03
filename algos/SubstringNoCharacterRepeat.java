class SubstringNoCharacterRepeat {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxCount = 0;

        while(right < s.length()) {
            if(!seen.contains(s.charAt(right))) {
              seen.add(s.charAt(right));
              maxCount = Math.max(maxCount, right - left + 1);
              right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return maxCount;
    }
}