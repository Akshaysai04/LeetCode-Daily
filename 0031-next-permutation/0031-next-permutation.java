class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length;;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
            if(pivot==-1){
                int a=0,b=nums.length-1;
                while(a<b){
                    int temp=nums[a];
                    nums[a]=nums[b];
                    nums[b]=temp;
                    a++;
                    b--;
                }               
            }else{
                for(int i=n-1;i>pivot;i--){
                    if(nums[i]>nums[pivot]){
                        int temp=nums[pivot];
                        nums[pivot]=nums[i];
                        nums[i]=temp;
                       int a=pivot+1,b=nums.length-1;
                while(a<b){
                    int tem=nums[a];
                    nums[a]=nums[b];
                    nums[b]=tem;
                    a++;
                    b--;
                }
            break;
                        
                    }
                }
            }
        }
    
    }
