class Solution 
{
    public int removeElement(int[] nums, int val)
    {
        int n=nums.length;
        int k=0;
        
        if(n==0)
        {
            return 0;
        }

        if(n==1)
        {
            return(nums[0]==val)? 0:1;
        }
      
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
                
            }
            
        }
       

        return k;
    }



    public static void main(String[] args)
    {
        int [] arr={3,2,2,3};
        
        Solution s1=new Solution();
        int res=s1.removeElement(arr,3);
        System.out.println(res);
        
    }
}