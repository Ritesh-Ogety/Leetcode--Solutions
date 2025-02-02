class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        // Creating a HashMap to store the elements ---> frequencies.
        Map <Integer,Integer> map=new HashMap<>();
        // Populating the HashMap
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // Creating a MaxHeap and sorting them using custom comparator.
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));

        for(int key : map.keySet())
        {
            maxHeap.add(key);
        }

        int [] res=new int[k];
        // Popping out the top required 'K' elelmnts.
        for(int i=0;i<k;i++)
        {
            res[i]=maxHeap.poll();
        }
        
        return res;
    }
}