class Solution 
{
    public int characterReplacement(String s, int k) 
    {
            int n=s.length();
            int left=0;
            int result=0;
            int maxFreq=0;
        
            Map<Character,Integer> map=new HashMap<>();
            for(int right=0;right<n;right++)
            {
                map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

                maxFreq=Math.max(maxFreq,map.get(s.charAt(right)));
                
                while((right-left+1)-maxFreq>k)
                {
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;
                }
                result=Math.max(result,right-left+1);
            }
            return result;
    }
}