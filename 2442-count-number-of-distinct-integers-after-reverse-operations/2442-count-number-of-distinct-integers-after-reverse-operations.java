class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        HashSet<Integer> a=new HashSet<>();
        for(int i:nums){
            a.add(i);
            int rev=0;
            while(i!=0){
                rev+=i%10;
                i/=10;
                if(i>0){
                    rev*=10;
                }
            }
            a.add(rev);
        }
        return a.size();
    
    }
}