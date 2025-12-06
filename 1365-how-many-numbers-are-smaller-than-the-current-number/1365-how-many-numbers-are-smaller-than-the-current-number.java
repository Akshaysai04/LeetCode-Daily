class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> a=Arrays.stream(nums).boxed().collect(Collectors.toList());
        int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            final int current=nums[i];
            long count=a.stream().filter(n -> n <current).count();
            b[i]=(int) count;
        }
        return b;
    }
}