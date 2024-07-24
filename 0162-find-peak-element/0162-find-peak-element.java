class Solution {
    public int findPeakElement(int[] nums) 
    {
        int n=nums.length;
        if(n==1) //if there is only 1 element in nums array
        {
            return 0; // then Starting element i.e.., Zeroth index  is peak element
        }
           if(nums[0]>nums[1])
        {
            return 0;
        }
        if(nums[n-1]>nums[n-2]) //last >lastsecond
        {
            return n-1; //then last element is peak element.
        }

        for(int i=1;i<n-1;i++)
        {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
            {
                return i; //index of peak element.
            }
        }
        return -1; //if peak element is not in nums array then return -1.
    }

    public static void main(String[] args)
    {
        int [] arr={1,2,3,1};
        Solution s1=new Solution();
        int res=s1.findPeakElement(arr);
        System.out.println(res);
        
    }
}