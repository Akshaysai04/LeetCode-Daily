class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> a=new HashSet<>();
        for(int i:nums){
        if(i<=nums.length && !a.contains(i) && i>0){
            a.add(i);
        }
        }
        for(int i=1;i<=nums.length;i++){
            if(!a.contains(i)){
                return i;
            }
        
        }
        return nums.length+1;
    }
}