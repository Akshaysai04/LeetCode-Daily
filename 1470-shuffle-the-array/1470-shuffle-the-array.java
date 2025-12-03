class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x[]=new int[n];
        int y[]=new int[n];
        int i=0;
        while(i<n){
            x[i]=nums[i];
            i++;
        }
        int j=0;
        while(i<nums.length){
            y[j]=nums[i];
            i++;
            j++;
        }
        i=0;
        j=0;
    for(int k=0;k<nums.length;k++){
        if(k%2==0){
            nums[k]=x[i];
            i++;
        }
        else{
            nums[k]=y[j];
            j++;
        }
    }
    return nums;
    }
}