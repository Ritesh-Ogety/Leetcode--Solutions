class Solution {
    public void sortColors(int[] nums) {

        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;

        for(int i=0;i<n;i++)
        {
            if(nums[mid]==0)
            {
                int c=nums[low];
                nums[low]=nums[mid];
                nums[mid]=c;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
                int c=nums[mid];
                nums[mid]=nums[high];
                nums[high]=c;
                high--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
        
    }

    public static void main(String[] args)
    {
        int [] arr={2,0,2,1,1,0};
        Solution s1=new Solution();
        s1.sortColors(arr);
    }
}