class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int maxbuy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(maxbuy<prices[i])
            {
                int prof=prices[i]-maxbuy;
                maxp=Math.max(prof,maxp);
            }else{
                maxbuy=prices[i];
            }
        }
        return maxp;
    }
}