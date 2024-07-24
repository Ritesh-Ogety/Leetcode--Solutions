class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int n=nums.length;// n stores the length of nums[].
        int lb=0; //lb=startIndex
        int ub=n-1;//ub=lastIndex
        int mid;
        while(lb<=ub)//Runs until lb is less than or equal to ub
        {
            mid=(lb+ub)/2; // calculating mid

            if(target==nums[mid]) //if target is equla to arr[mid] return the index of mid
            {
                return mid;
            }
            else if(target>nums[mid]) //if target is greater than arr[mid] it means tarhert is on right half of the array, so update lb=mid+1. 
            {
                lb=mid+1;
            }
            else //if target is less than arr[mid] it means target is on left half of the array, so update ub=mid-1. 
            {
                ub=mid-1;
            }
            
        }      
        return lb;   //  If target is not found , return the index where it would be if it were inserted in order. i.e.., lb.
    }


    public static void main(String[] args)
    {
        int [] arr={1,3,5,6};
        Solution s1=new Solution();
        System.out.println(s1.searchInsert(arr,7)); 
    }
}