class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        HashSet  <Integer> h1=new HashSet<>();
        ArrayList <Integer> al=new ArrayList<>();
        for(int num : nums)
        {
            if(!h1.add(num))
            {
                al.add(num);
            }
        }
        return al;
    }



    public static void main(String[] args)
    {
        int [] arr={1,1,2};
        Solution s1=new Solution();
        System.out.println(s1.findDuplicates(arr));
    }
}