

class Solution
 {
    
    public int[] twoSum(int[] nums, int target) 
    {
        
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int [] {i,j};
                }
            }
        }
        return new int [] {-1,-1};
    }
    public static void main(String[] args)
    {
        int [] arr={3,3};
        int taget=9;
        Solution s1=new Solution();
        int [] res=s1.twoSum(arr,taget);
        if(res[0]!=-1)
        {
            System.out.println(res[0]+" "+res[1]);
        }
        else
        {
            System.out.println("Soltion not found");
        }
    }
}







