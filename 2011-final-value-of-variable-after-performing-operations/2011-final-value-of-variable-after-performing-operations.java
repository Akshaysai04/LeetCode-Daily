class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(String b:operations){
            if("X++".equals(b) || "++X".equals(b)){
                a+=1;
            }else{
                a-=1;
            }
        }
        return a;
    }
}