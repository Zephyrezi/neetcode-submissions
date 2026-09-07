class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
                unique.add(nums[i]);
        }
        if(unique.size() != nums.length) {
            return true;
        }
        return false;
    }
}