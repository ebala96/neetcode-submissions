class Solution {
    public int maxProfit(int[] prices) {
        int lftPtr = 0;
        int rightPtr = lftPtr + 1;
        int maxProfit = 0;

        while(rightPtr < prices.length){
            if(prices[rightPtr] < prices[lftPtr]){
                lftPtr = rightPtr;
            }else{
                maxProfit = Math.max(maxProfit, prices[rightPtr] - prices[lftPtr]);
            }
            rightPtr++;
        }

        return maxProfit;
        
    }
}
