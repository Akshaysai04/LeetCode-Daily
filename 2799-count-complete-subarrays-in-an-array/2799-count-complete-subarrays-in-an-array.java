class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int k=(int) Arrays.stream(nums).distinct().count(); 
        int res=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> a=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                a.add(nums[j]);
                if(a.size()==k){
                    res++;
                }
            }
        }
        return res;
    }
}