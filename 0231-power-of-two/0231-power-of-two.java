class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        if(n==1) return true;

        int ans=0;
        for(int i=0;i<31;i++)
        {
            ans=(int)Math.pow(2,i);
            if(ans==n)
            {
                return true;
            }
        }
        return false;
        


    }

    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.isPowerOfTwo(16));
    }
}