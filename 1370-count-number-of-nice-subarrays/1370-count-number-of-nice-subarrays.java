class Solution 
{
    public int numberOfSubarrays(int[] nums, int k) 
    {
       int n=nums.length;
       int i=0;
       int j=0;
       int temp=0;
       int oddCount=0;
       int count=0;

       while(j<n)
       {
            if(nums[j]%2!=0)
            {
                oddCount++;
                temp=0;
            }
            while(oddCount==k)
            {
                temp++;
                if(nums[i]%2!=0)
                {
                    oddCount--;
                    
                }
                i++;
            }

            count+=temp;
            j++;
       }
       return count;
    }
}

/*  Brute force
     int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++)
        {
            int oddCount=0;
            for(int j=i;j<n;j++)
            {

                if(nums[j]%2!=0)
                {
                    oddCount++;
                }
                if(oddCount==k)
                {
                    count++;
                }
            }
            
        }
        return count;
 */