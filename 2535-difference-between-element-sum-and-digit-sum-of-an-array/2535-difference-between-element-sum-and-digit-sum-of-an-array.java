class Solution {
    public int differenceOfSum(int[] nums) {
    int dsum=0;
    int esum=0;
    for(int i:nums)
    {
      esum+=i;
      int k=i;
      while(k!=0)
      {
        esum-=k%10;
        k=k/10;
      }
    }
    Math.abs(esum);    
    return esum;
    }

    
}