class Solution 
{
    public int totalFruit(int[] fruits) 
    {
        int n=fruits.length;
        Map <Integer,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0; right<n;right++)
        {
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2)
            {
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0)
                {
                    map.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
/*
    // Brute force approach
        int n=fruits.length;
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            Set <Integer> set=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                set.add(fruits[j]);
                if(set.size()<=2)
                {
                    max=Math.max(max,j-i+1);
                }
                else
                {
                    break;
                }
            }
        }  
        return max;  
*/