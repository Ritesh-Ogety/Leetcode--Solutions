class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
            return false;
        }
        int num=x;
        int digits;
        int rev=0;
        while(x!=0)
        {
            digits=x%10;
            rev=rev*10+digits;
            x/=10;
        }
        
        return num==rev;
    }


    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.isPalindrome(121));
    }
}