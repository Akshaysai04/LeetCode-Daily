class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        for(char c:s.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        int i=0;
        for(char c:s.toCharArray()){
            
            if(a.get(c)==1){
                return i;
            }
            i=i+1; 
        }
        return -1;
    }
}