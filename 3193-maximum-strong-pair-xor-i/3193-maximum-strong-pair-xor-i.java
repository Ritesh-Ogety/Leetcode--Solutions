class Solution 
{
    public int maximumStrongPairXor(int[] nums) 
    {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int x=nums[i], y=nums[j];
                if(Math.abs(x-y)<=Math.min(x,y))
                {
                    max=Math.max(max,x^y);
                }
            }
        }
        return max;
    }
}