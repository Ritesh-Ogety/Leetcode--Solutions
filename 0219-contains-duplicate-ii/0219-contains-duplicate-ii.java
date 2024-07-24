class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k)
    {
        // Creating a hashMap with instance hm:stores values in keyvalue pairs.
        HashMap<Integer,Integer> hm=new HashMap<>();
        //iterating through array.
        for(int i=0;i<nums.length;i++)
        {

        // checks if the currebbt element is present in the array then checks the |currentIndexEle-Lastindex where it was present|<=3.    
            if(hm.containsKey(nums[i]) && Math.abs(i-hm.get(nums[i]))<=k)
            {
                return true;
            }
            //Then it updates duplicate element in HashMap.
            hm.put(nums[i],i);
        }
        return false;
    }


    public static void main(String[] args)
    {
        int [] arr={1,2,3,1};
        Solution s1=new Solution();
        System.out.println(s1.containsNearbyDuplicate(arr,3));
    }



}



/*  Brute force:
       for(int  i=0;i<nums.length;i++)
       {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j]&&Math.abs(i-j)<=k)
                {
                    return true;
                }
            }
       }
       return false;
       */