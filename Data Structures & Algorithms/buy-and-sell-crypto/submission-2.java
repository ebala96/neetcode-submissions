class Solution {
    public int maxProfit(int[] prices) {
        // 1. Define left pointer at 0 and right pointer at left pointer + 1
        int lftPtr = 0;
        int rightPtr = lftPtr + 1;
        int maxProfit = 0;
  
        while(rightPtr < prices.length){
            // 2. Check if right value is less then left value.
            // 3. If yes then swap right pointer value to left pointer and increment right pointer
            if(prices[rightPtr] < prices[lftPtr]){
                lftPtr = rightPtr;
            }else{
                // 4. Calculate max profile between prev maxProfit value and current difference between two pointer values
                maxProfit = Math.max(maxProfit, prices[rightPtr] - prices[lftPtr]);
            }
            rightPtr++;
            // 5. Continue till right pointer reaches the length of the array
        }

        return maxProfit;
        
    }
}
