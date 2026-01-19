class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int[] a=new int[code.length];
        if(k==0){
           return a;
        }
        for(int i=0;i<a.length;i++){
          if(k>0){  for(int j=i+1;j<i+k+1;j++){
                a[i]+=code[j%code.length];
            }}else{
                for(int j=i-Math.abs(k);j<i;j++){
                a[i]+=code[(j+code.length)%code.length];
                }
            }
        }
    
    return a;
    }
}