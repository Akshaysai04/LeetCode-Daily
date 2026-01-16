class Solution {
    public int[] minOperations(String boxes) {
        int[] ans=new int[boxes.length()];
        List<Integer> pos=new ArrayList<>();
        int len=boxes.length();
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                pos.add(i);
            }
        }
        for(int i=0;i<boxes.length();i++){
            int sum=0;
            for(int idx:pos){
                int dst=Math.abs(i-idx);
                sum+=dst;
            }
            ans[i]=sum;  
        }
        return ans;
    }
}