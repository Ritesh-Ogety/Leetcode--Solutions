class Solution 
{
    public long findTheArrayConcVal(int[] nums) 
    {
        int n=nums.length;
        int left=0;
        int right=n-1;
        String temp="";
        long result=0;

        while(left<=right) 
        {
            if(left==right)
            {
                temp=String.valueOf(nums[left]);
            }
            else
            {
                temp=String.valueOf(nums[left])+String.valueOf(nums[right]);
            }
            result+=Integer.parseInt(temp);
            left++;
            right--;
        }  
        return result;
    }
}