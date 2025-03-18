class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int max = 0;
        int val = 0, start = 0;

        for (int i = 0; i < n; i++) {
            while ((val & nums[i]) != 0) {  
                val ^= nums[start];  // Remove nums[start] bits
                start++;
            }
            val |= nums[i];  // Add nums[i] to the window
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
