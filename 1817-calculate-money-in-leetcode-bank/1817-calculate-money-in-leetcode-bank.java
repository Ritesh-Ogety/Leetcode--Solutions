class Solution {
    public int totalMoney(int n) 
    {
        if(n<=7) return n*(n+1)/2;
        int x=28;
        int weeks=n/7;
        int remain=n-weeks*7;
        int t1=x*weeks+7*(weeks*(weeks-1))/2;
         int t2=(2*weeks+remain+1)*remain/2;
        return t1+t2;
           
    }



    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.totalMoney(4));
    }
}