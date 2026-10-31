class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int maxProfit=0;
        while(r<prices.length){
            int currenProfit=0;
            if(prices[r]>prices[l]){
                    currenProfit=prices[r]-prices[l];
                    maxProfit=Math.max(currenProfit,maxProfit);
             }
             
             else{
                l=r;
             }
            r++;
        }
        return maxProfit;
    }
}
