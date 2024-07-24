class Solution {
    public int search(int[] nums, int target)
    {
        int lb=0;
        int ub=nums.length-1;
        int mid;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;

            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                lb=mid+1;
            }
            else
            {
                ub=mid-1;
            }
        }

        return -1;
    }



    
}