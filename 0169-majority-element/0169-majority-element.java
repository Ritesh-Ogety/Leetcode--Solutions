class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int majorityElement = -1;  // Initialize to a value indicating no majority element
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                continue;
            } else {
                for (int j = 0; j <= i; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }

            if (count > maxCount) {
                maxCount = count;
                majorityElement = nums[i];
            }
        }

        // Check if the majority element appears more than n/2 times
        if (maxCount > n / 2) {
            return majorityElement;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        Solution s1 = new Solution();
        int res = s1.majorityElement(arr);
        System.out.println(res);
    }
}
