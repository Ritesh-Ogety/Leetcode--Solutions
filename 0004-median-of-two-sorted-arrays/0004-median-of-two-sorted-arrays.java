class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int i=0;
        int j=0;
        int k=0;
        int [] res=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                res[k++]=nums1[i++];
            }
            else
            {
                res[k++]=nums2[j++];
            }
        }
        while(i<nums1.length)
        {
            res[k++]=nums1[i++];
        }
        while(j<nums2.length)
        {
            res[k++]=nums2[j++];
        }
        if(res.length%2==0)
        {
            return (res[res.length/2]+res[res.length/2 -1])/2.0;
        }
        return res[res.length/2];
    }



    public static void main(String[] args)
    {
        int [] arr1={1,3};
        int [] arr2={2};
        Solution s1=new Solution();
        System.out.println(s1.findMedianSortedArrays(arr1,arr2));
    }



}