class Solution {
    public int numIdenticalPairs(int[] nums) {
    int[] freq=new int[101];
    int good=0;
    for(int num:nums){
        good+=freq[num];
        freq[num]++;
    }
    return good;
    }
}