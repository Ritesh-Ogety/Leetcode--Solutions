class Solution {
    public int removeDuplicates(int[] nums)
    {
        int n=nums.length;
       if(n==0)
       {
           return 0;
       }
        int k=0;
       
        for(int i=1;i<n;i++)
        {
            if(nums[k]!=nums[i])
            {
                k++;
                nums[k]=nums[i];
            }
        }

        for(int i=0;i<=k;i++)
        {
            System.out.print(nums[i] +" ");
        }

        return k+1;
    }



    public static void main(String[] args)
    {
        int [] arr={1,1,2};
        Solution s1=new Solution();
        int res=s1.removeDuplicates(arr);
        System.out.println(res);
    }
}