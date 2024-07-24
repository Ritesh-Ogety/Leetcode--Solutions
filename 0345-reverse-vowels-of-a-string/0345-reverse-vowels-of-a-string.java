class Solution {
    public String reverseVowels(String s) 
    {
        char [] cArray=s.toCharArray();
        int left=0;
        int right=cArray.length-1;
        while(left<right)
        {

        
        while(left<right && !isVowel(cArray[left]))
        {
            left++;
        }
         while(left<right && !isVowel(cArray[right]))
        {
            right--;
        }
        if(left<right)
        {
            
        char c=cArray[left];
        cArray[left]=cArray[right];
        cArray[right]=c;
        left++;
        right--;
        }
        }


        return new String(cArray);
    }
    public boolean isVowel(char ch)
        {
            return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    
        }



    public static void main(String[] args)
    {
        String str="hello";
        Solution s1=new Solution();
        s1.reverseVowels(str);

    }
}