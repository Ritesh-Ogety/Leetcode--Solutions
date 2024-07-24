class Solution 
{
    public String sortVowels(String s) 
    {
        char [] arr=s.toCharArray();

        StringBuilder vowels=new StringBuilder();
        StringBuilder vowel_idx=new StringBuilder();

        for(int i=0;i<arr.length;i++)
        {
            if(isVowel(arr[i]))
            {
                vowels.append(arr[i]);
                vowel_idx.append(i);
            }
        }
        char [] vowels_sort=vowels.toString().toCharArray();
        Arrays.sort(vowels_sort);

        int new_vowel_idx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(isVowel(arr[i]))
            {
                arr[i]=vowels_sort[new_vowel_idx];
                new_vowel_idx++;
            }
        }
        return new String(arr);
    }


    public boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'; 
    }
    public static void main(String[] args)
    {
        String str="lEetcOde";
        Solution s1=new Solution();
        System.out.println(s1.sortVowels(str));
    }
}



/*
The below code also works for most of the test cases but in case in the array if last char is an vowel it 
immeadiately swaps(); 
but *** if any futher chars with smaller ASCII value  are present it dostnt checks them so above code verifies it. 
    public String sortVowels(String s) 
    {
       char [] arr=s.toCharArray();
       
       int left=0;
       int right=arr.length-1;
       
       while(left<right)
       {
            while(left<right && !isVowel(arr[left]))
            {
                left++;
            }
            while(left<right && !isVowel(arr[right]))
            {
                right--;
            }
            if(left<right && arr[left]>arr[right])
            {
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                
            }
            left++;
            right--;
       }
       return new String(arr);
    }


    public boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'; 
    }
 */