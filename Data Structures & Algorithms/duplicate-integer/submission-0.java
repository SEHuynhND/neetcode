class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hase = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if (hase.contains(nums[i])) {
                return true;
            } else hase.add(nums[i]);
        }
        return false;
    }
}