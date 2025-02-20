class Solution 
{
    public int findMaxK(int[] nums) 
    {
        Set <Integer> set = new HashSet<>();
        int largest=-1;
        for(int num:nums)
        {
            set.add(num);
            if(set.contains(-num))
            {
                largest=Math.max(largest,Math.abs(num));
            }
        }
        return largest;
    }
}
/*  
    int n=nums.length;
        int largest=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] == -nums[j])
                {
                    largest=Math.max(largest,Math.abs(nums[i]));
                }
            }
        }
       
       return largest;
 */