class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        int count=0;

        for(int num:nums)
        {
            if(num<k)
            {
                heap.add(num);
            }
        }    
        while(!heap.isEmpty())
        {
            int min1=heap.poll();
            count++;
            if(heap.isEmpty())
            {
                break;
            }
            int min2=heap.poll();
            long val=min1*2L+min2;

            if(val<k)
            {
                heap.add((int)val);
            }
        }
        return count;
    }
}
/*
    //Without using Collections Approach
    class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        
        int n=nums.length;
        if(n<2) return 0;
        int k1=0;
        int count=0;
        Arrays.sort(nums);
        
          
            while(nums[k1]<k)
            {
               if(k1>=nums.length-1)
               {
                    break;
               }
               int min1=nums[k1];
               int min2=nums[k1+1];
               int val=Math.min(min1,min2)*2+Math.max(min1,min2);
               nums[k1+1]=val;
               k1++;
               count++;
               Arrays.sort(nums,k1,n);
            }
        
        return count;    
    }
}
 */