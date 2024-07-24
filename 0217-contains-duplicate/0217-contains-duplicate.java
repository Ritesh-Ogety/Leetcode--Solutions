class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        int i=0;
        int count=1;
        
        while(i<nums.length-1)
        {
            if(nums[i]==nums[i+1])
            {
                count++;
            }
            i++;
        }
        if(count>=2)
        {
            return true;
        }

        return false;
    }


    public static void main(String[] args)
    {
        int [] arr={1,2,3,1};
        Solution s1=new Solution();
        System.out.println(s1.containsDuplicate(arr));
    }
}