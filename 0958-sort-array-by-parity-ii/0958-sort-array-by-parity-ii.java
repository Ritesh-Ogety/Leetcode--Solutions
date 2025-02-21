class Solution 
{
    public int[] sortArrayByParityII(int[] nums) 
    {
        // nums[i]--> odd  indxex --> odd
        // nums[i]--> even index -->  even

        int n=nums.length;
        int even=0;
        int odd=1;
        int [] res=new int[n];

        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                res[even]=nums[i];
                even+=2;
            }
            else
            {
                res[odd]=nums[i];
                odd+=2;
            }
        }
        return res;
    }
}