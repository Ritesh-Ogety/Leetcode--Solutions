class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        char [] sArray=s.toCharArray();
        char [] tArray=t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String S=new String(sArray);
        String T=new String(tArray);

        return S.equals(T);
    }


    public static void main(String[] args)
    {
        String s="anagram";
        String t="nagaram";
        Solution s1=new Solution();
        System.out.println(s1.isAnagram(s,t));
    }
}