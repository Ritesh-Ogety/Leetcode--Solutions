class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }



    public static void main(String[] args)
    {
        int [] arr={3,2,1,5,6,4};
        Solution s1=new Solution();
        System.out.println(s1.findKthLargest(arr,2));
    }
}