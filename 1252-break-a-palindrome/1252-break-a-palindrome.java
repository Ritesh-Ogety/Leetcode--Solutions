class Solution {
    public String breakPalindrome(String palindrome) 
    {
        char [] arr= palindrome.toCharArray();
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]!='a')
            {
                arr[i]='a';
                return new String(arr);
            }
        }
        arr[arr.length-1]='b';
        return arr.length<2?"":new String(arr);

    }



    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.breakPalindrome("abccba"));
    }
}