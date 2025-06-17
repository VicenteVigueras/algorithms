class RemoveElement {
    public int removeElement(int[] nums, int val) {
       int count = 0;
       int[] ans = new int[nums.length];
       for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                nums[i] = 0;
                continue;
            } else {
                count++;
            }
       }
       Arrays.sort(nums);   
       return count;
       }
    }
