class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int left=0;
        int cSum=0;
        int minLength=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            cSum+=nums[i];
            while(cSum>=target)
            {
                minLength=Math.min(minLength,i-left+1);
                cSum-=nums[left];
                left++;
            }
        }

        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}