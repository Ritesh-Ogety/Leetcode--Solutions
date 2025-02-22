class Solution 
{
    public int minimumDifference(int[] nums, int k) 
    {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<=n-k;i++)
        {
            int max=nums[i+k-1];
            int min=nums[i];
            res=Math.min(res,max-min);
        }
        return res;
    }
}