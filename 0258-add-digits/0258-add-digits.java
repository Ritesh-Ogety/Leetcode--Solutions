class Solution {
    public int addDigits(int num)
    {
        return num==0?0:(num-1)%9+1;
    }


    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.addDigits(38));
    }
}