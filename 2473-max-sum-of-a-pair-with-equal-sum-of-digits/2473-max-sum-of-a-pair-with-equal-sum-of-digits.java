class Solution 
{
    public int maximumSum(int[] nums) 
    {
        int n=nums.length;
        
        int [] unitDigitSum=new int [n];
        Map<Integer, int []> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int sum=0;
            int num=nums[i];
            while(num>0)
            {
               int r=num%10;
                sum+=r;
                num/=10;
            }
            unitDigitSum[i]=sum;
        
        
    

        if(!map.containsKey(sum))
        {
            map.put(sum,new int[] {nums[i],-1});
        }
        else
        {
            int first=map.get(sum)[0];
            int second=map.get(sum)[1];

            if(nums[i]>first)
            {
                map.get(sum)[1]=first;
                map.get(sum)[0]=nums[i];
            }
            else if(nums[i]>second)
            {
                map.get(sum)[1]=nums[i];
            }
        }
        }
        int max=-1;
        for(int [] pairs : map.values())
        {
            if(pairs[1]!=-1)
            {
                max=Math.max(max,pairs[0]+pairs[1]);
            }
        }
        
    
        return max;    
    }

}

// Brute Force Approach
/*
    int n=nums.length;
        
        int r;
        int [] unitDigitSum=new int [n];
        
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int num=nums[i];
            while(num>0)
            {
                r=num%10;
                sum+=r;
                num/=10;
            }
            unitDigitSum[i]=sum;
        }
        
        int max=-1;
        for(int i=0;i<unitDigitSum.length;i++)
        {
            for(int j=i+1;j<unitDigitSum.length;j++)
            {
                if(unitDigitSum[i]==unitDigitSum[j])
                {
                    max=Math.max(max,nums[i]+nums[j]);
                }
            }
        }
        return max;    
 */