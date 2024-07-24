class Solution {
    public int trap(int[] height) {
        int i=0;
        int leftMax=height[0];
        int j=height.length-1;
        int rightMax=height[j];
        int sum=0;
        while(i<j)
        {
            if(leftMax<=rightMax)
            {
                sum+=(leftMax-height[i]);
                i++;
                leftMax=Math.max(leftMax,height[i]);
            }
            else
            {
                sum+=(rightMax-height[j]);
                j--;
                rightMax=Math.max(rightMax,height[j]);
                
            }
        }
        return sum;
        
    }
    public static void main(String[] args)
    {
        int [] arr={4,2,0,3,2,5};
        Solution s1=new Solution();
        System.out.println(s1.trap(arr));
    }
}