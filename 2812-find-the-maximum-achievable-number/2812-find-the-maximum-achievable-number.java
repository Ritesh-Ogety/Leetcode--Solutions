class Solution {
    public int theMaximumAchievableX(int num, int t) 
    {
        
        return num+(t*2);
    }


    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.theMaximumAchievableX(4,1));
    }
}