class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (set.contains(curr)) {
                return true;
            }
            set.add(curr);
        }
        return false;
    }
    
}