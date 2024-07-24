class Solution 
{
    public int getLucky(String s, int k) 
    {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            int p=(c-'a')+1;
            sb.append(p);
        }
        String str=sb.toString();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (char ch : str.toCharArray()) {
                sum += ch - '0'; 
            }
            str = String.valueOf(sum);
        }
        return sum;
    }
    

    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.getLucky("iiii",1));
    }
}