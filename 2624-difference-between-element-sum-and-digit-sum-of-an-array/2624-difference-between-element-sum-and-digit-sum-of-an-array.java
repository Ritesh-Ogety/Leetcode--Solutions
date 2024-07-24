class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0;
        int digSum=0;

        for(int i=0;i<nums.length;i++)
        {
            eleSum+=nums[i];

            int val=nums[i];

            while(val>0)
            {
                digSum+=val%10;
                val/=10;
            }
        }
        return Math.abs(eleSum-digSum);
        
        
    }
}