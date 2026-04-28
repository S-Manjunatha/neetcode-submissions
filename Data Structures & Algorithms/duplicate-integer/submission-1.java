class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int r = 0;
        int l = 1;

        while (r<n && l<n) {
            if (nums[r]==nums[l]) {
                return true;
            } else {
                r += 2;
                l += 2;
            }
        }
        return false;
    }
}