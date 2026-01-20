class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        for(int i:nums){
            if(i<pivot){
                a.add(i);
            }else if(i==pivot){
                b.add(i);
            }else{
                c.add(i);
            }
        }
        int k=0;
        for(int i:a){
        nums[k++]=i;
        }
        for(int i:b){
            nums[k++]=i;
        }
        for(int i:c){
            nums[k++]=i;
        }
        return nums;
    }
}