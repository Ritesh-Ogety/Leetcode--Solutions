class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        Set <Integer> distinctElements=new HashSet<>();
        for(int num : nums)
        {
            if(num<k)
            {
                return -1;
            }
            else if(num>k)
            {
                distinctElements.add(num);
            }
        }
        return distinctElements.size();        
    }
}