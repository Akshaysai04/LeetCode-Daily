class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1=nums1.length;
        int b1=nums2.length;
        int c1=a1+b1;
        int k=0;
        int num3[]=new int[c1];
        for(int i=0;i<a1;i++){
            num3[i]=nums1[i];
        }
        for(int i=0;i<b1;i++){
            num3[a1+i]=nums2[i];
        }
        Arrays.sort(num3);

 int total = num3.length;

        if (total % 2 == 1) {
            
            return (double) num3[total / 2];
        } else {
           
            int middle1 = num3[total / 2 - 1];
            int middle2 = num3[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}