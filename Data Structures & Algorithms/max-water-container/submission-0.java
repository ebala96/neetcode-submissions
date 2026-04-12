class Solution {
    public int maxArea(int[] heights) {
        int lftPtr= 0;
        int rightPtr = heights.length -1;
        int maxArea = 0;

        while(lftPtr < rightPtr){
            // 1. Take the min value of left and right bar height and multiply with x -axis plane which is (rightPtr - lftPtr)
            int currentMax = Math.min(heights[lftPtr], heights[rightPtr]) * (rightPtr - lftPtr);
            
            // 2. Compare with previous max with current max value and assign max value.
            maxArea = Math.max(maxArea, currentMax);
            // 3. if lftPtr value is lesser than right ptr value increment left index, else decrement right index
            if(heights[lftPtr] < heights[rightPtr]){
                lftPtr++;
            }else{
                rightPtr--;
            }
        }

        return maxArea;
        
    }
}
