class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int[] good = new int[n];
        
        for (int i = 0; i < n; i++) {
            if ((i - k >= 0 ? nums[i] > nums[i - k] : true) && (i + k < n ? nums[i] > nums[i + k] : true)) {
                good[i] = nums[i];
            }
        }
        
        int sum = 0;
        for (int num : good) {
            sum += num;
        }
        
        return sum;
    }
}
