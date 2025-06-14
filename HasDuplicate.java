class HasDuplicate {
    public boolean hasDuplicate(int[] nums) {
     var seen = new HashSet<Integer>();
     for(int i = 0; i < nums.length; i++) {
        if(!seen.add(nums[i])) {
          return true;
        }
     }
     return false;
    }
}
