class Solution {
    public List<Integer> majorityElement(int[] nums) {
     int n=nums.length;
     List<Integer> b=new ArrayList<>();
     HashMap<Integer,Integer> a=new HashMap<>();
     for(int i:nums){
        a.put(i,a.getOrDefault(i,0)+1);
     }
     int t=n/3;
     for(Map.Entry<Integer,Integer> entry:a.entrySet()){
        int ele=entry.getKey();
        int count=entry.getValue();
        if(count>t){
            b.add(ele);
        }
     }
     return b;   
    }
}