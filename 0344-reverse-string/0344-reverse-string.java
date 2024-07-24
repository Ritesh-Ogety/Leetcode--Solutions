class Solution {
    public void reverseString(char[] s) 
    {
        int left=0;
        int right=s.length-1;
        while(left<right)
        {
            swap(s,left,right);
            left++;
            right--;
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]);
        }
    }
    public void swap(char[] s,int left,int right)
    {
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
    }



    public static void main(String[] args)
    {
        char [] arr={'h','e','l','l','o'};
        Solution s1=new Solution();
        s1.reverseString(arr);
    }
}