class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            boolean flag=false;
            int count=0;
           for(int j=i+1;j<nums.length;j++)
           {
             if(nums[i]==nums[j])
             {
                flag=true;
                break;
             }
           }
           if(flag)
           {
                continue;
           }
           else
           {
                for(int j=0;j<=i;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        count++;
                    }
                }
           }
           if(count==1)
           {
                sum+=nums[i];
           }
        }
        return sum;
    }


    public static void main(String[] args)
    {
        int [] arr={1,2,3,2};
        Solution s1=new Solution();
        System.out.println(s1.sumOfUnique(arr));
    }
}