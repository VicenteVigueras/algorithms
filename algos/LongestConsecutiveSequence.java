class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nums_set = new HashSet<>();
        int final_streak = 0;

        for(int number: nums) {
            nums_set.add(number);
        }

        for(int number: nums_set) {
            if(!nums_set.contains(number - 1)) {
                int currentStreak = 1;
                int currentNumber = number;
                
                while(nums_set.contains(currentNumber + 1)) {
                    currentStreak += 1;
                    currentNumber += 1;
                }
    
                final_streak = Math.max(currentStreak, final_streak);
            }
        }
        return final_streak;
    }
}