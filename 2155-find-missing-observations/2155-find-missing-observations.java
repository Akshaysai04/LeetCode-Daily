class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] a=new int[n];
        int s=0;
        for(int i:rolls){
            s+=i;
        }
        int m=rolls.length;
        int total=mean*(n+m);
        int missing=total-s;
        int d=missing/n;
        int k=missing%n;
        if(missing> 6*n || missing <n){
            return new int[0];
        }
        Arrays.fill(a,d);
        for(int i=0;i<k;i++){
            a[i]++;
        }


return a;
    }
}