class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int [] res=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int c=nums[i];
                nums[i]=nums[j];
                nums[j]=c;
                j++;
            }
        }
        System.out.print("[");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]);
            if(i<nums.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("]");    
    }
    public static void main(String[] args)
    {
        int [] arr={0,1,0,3,12};
        Solution s1=new Solution();
        s1.moveZeroes(arr);
    }
}