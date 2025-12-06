class Solution {
    public int[] findErrorNums(int[] nums) {
      int dup=-1;
      int ch=-1;
      int fre[]=new int[nums.length+1];
      for(int num:nums){
        fre[num]++;
      }
      for(int i=1;i<fre.length;i++){
        if(fre[i]==2){
            dup=i;
        }
        if(fre[i]==0){
            ch=i;
        }
      }
      return new int[]{dup,ch};

    }
}