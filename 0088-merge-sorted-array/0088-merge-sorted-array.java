class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i=0;
        int j=0;
        int k=0;
        int [] res=new int[nums1.length];

        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                res[k++]=nums1[i++];
            }
            else
            {
                res[k++]=nums2[j++];
            }
        }
        while(i<m)
        {
            res[k++]=nums1[i++];
        }
        while(j<n)
        {
            res[k++]=nums2[j++];
        }
        for(i=0;i<m+n;i++)
        {
            nums1[i]=res[i];
        }
        for(i=0;i<m+n;i++)
        {
            System.out.print(nums1[i]+ " ");
        }    
    }
}