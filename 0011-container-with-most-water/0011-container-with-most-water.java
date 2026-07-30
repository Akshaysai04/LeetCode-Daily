class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int bes=0;
        while(i<j)
        {
            int h=Math.min(height[i],height[j]);
            bes=Math.max(bes,h*(j-i));
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return bes;
    }
}