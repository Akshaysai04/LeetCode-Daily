class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(ans.contains(arr[i]*2))
            {
                return true;
            }
            else if(arr[i]%2==0 && ans.contains(arr[i]/2))
            {

                return true;
            }
            else
        {
            ans.add(arr[i]);
        }
        }
        return false;
        
    }
}