class Solution {
    public String reverseWords(String s)
    {
        String[] words=s.split(" +");//split as input may contain 1 or more spaces
        //words={"the","sky","is","blue"};
        //          0     1    2    3
        StringBuilder sb=new StringBuilder();

        for(int i=words.length-1;i>=0;i--)// reevsrse the order of words
        {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }



    public static void main(String[] args)
    {
        String str="the sky is blue";
        Solution s1=new Solution();
        System.out.print(s1.reverseWords(str));
    }
}