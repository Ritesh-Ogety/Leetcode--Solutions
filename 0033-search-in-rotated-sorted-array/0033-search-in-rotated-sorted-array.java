class Solution
{
    public int search(int[] nums, int target) 
    {
        int n=nums.length;
        int low=0;
        int high=n-1;

        while(low<=high)
        {
            // Calculating mid.

            int mid=low+(high-low)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            // Left half of the Array is sorted

            if(nums[low]<=nums[mid])
            {
                // Implementing Binary Search for left half.

                if(nums[low]<=target && target<nums[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            //Right half of the Array is sorted.
            else
            {
                //Implementing Binary Search for Right half.
                if(nums[mid]<target && target<=nums[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}