class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]==nums[1]&&nums[1]==nums[2])
            return "equilateral";
        else if(nums[0]+nums[1]<=nums[2]||nums[0]+nums[2]<=nums[1]||nums[1]+nums[2]<=nums[0])
            return "none";
        else if(nums[0]==nums[1]||nums[1]==nums[2]||nums[0]==nums[2])
            return "isosceles";
        else
            return "scalene";
    }


    public static void main(String[] args)
    {
        int [] arr={3,4,5};
        Solution s1=new Solution();
        System.out.println(s1.triangleType(arr));
    }
}