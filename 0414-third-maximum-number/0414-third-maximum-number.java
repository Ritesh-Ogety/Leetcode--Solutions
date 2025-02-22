class Solution 
{
    public int thirdMax(int[] nums) 
    {
        Arrays.sort(nums);
        if(nums.length==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        Stack <Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            if(stack.isEmpty() || stack.peek()!=nums[i])
            {
                stack.push(nums[i]);
            }
            if(stack.size()==3)
            {
                return stack.peek();
            }
        }
        return stack.firstElement();      
    }
}