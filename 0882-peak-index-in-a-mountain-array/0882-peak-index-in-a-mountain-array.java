class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                peak=i+1;
                break;
            }
            
        }
        return peak;
    }
}