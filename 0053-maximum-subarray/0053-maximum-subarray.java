class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int n=nums.length;
        if(nums.length==0) return nums[0];

        int cSum=0;
        int mSum=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            cSum+=nums[i];
            mSum=Math.max(cSum,mSum);

            if(cSum<0)
            {
                cSum=0;
            }
        }
        return mSum;
    }
}