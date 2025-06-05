class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        Arrays.sort(strs);
        int count = Math.min(strs[0].length(),strs[strs.length - 1].length());
        for(int i = 0; i < count; i++) {
            if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                answer += strs[0].charAt(i);
            } else {
                break;
            }
        }
        return answer;
    }
}