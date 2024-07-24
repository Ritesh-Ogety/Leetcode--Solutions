class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int [] res=new int[nums1.length];
        int k=0;
        int i=0;
        int j=0;
        
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                res[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                res[k]=nums2[j];
                j++;
                k++;
            }
        }


            while(i<m)
            {
                res[k]=nums1[i];
                i++;
                k++;
            }
            while(j<n)
            {
                res[k]=nums2[j];
                j++;
                k++;
            }

        for(i=0;i<m+n;i++)
        {
            nums1[i]=res[i];
        }   
        
        for(i=0;i<m+n;i++)
        {
            System.out.print(nums1[i]+" ");
        }
    }



    public static void main(String[] args)
    {
        int [] arr1={1,2,3,0,0,0};
        int m=3;
        int [] arr2={2,5,6};
        int n=3;
        Solution s1=new Solution();
        s1.merge(arr1,m,arr2,n);
    }
}