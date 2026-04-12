class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Sort the array in ascending order.
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            // 2. Set the first value to consider.
            int firstValue = nums[i];
            // 3. If considered value is positive we break since array is sorted.
            if(firstValue > 0) break;
            
            // 4. If considered value is same as previous considered value, goto next iteration
            // This is done to avoid duplicates.
            if(i > 0 && firstValue == nums[i - 1]) continue;
            

            // 5. initialize the left and right pointers and do the two sums steps with considered value
            int lftPtr = i + 1, rightPtr = nums.length -1;
            while(lftPtr < rightPtr){
                if(firstValue + nums[lftPtr] + nums[rightPtr] == 0){
                    // 6. If the value is found, add three values to result array.
                    resultList.add(Arrays.asList(firstValue, nums[lftPtr], nums[rightPtr]));

                    // 7. Once value is added to array, increament left pointer and decrement right pointer and find any other possible triplets. 
                    lftPtr++;
                    rightPtr--;
                    
                    // 8. Here check if left pointer with it previous value to avoid duplicates.
                    while(lftPtr < rightPtr && nums[lftPtr] == nums[lftPtr -1]){
                        lftPtr++;
                    }
                }
                if(firstValue + nums[lftPtr] + nums[rightPtr] > 0 ){
                    rightPtr--;
                }
                if(firstValue + nums[lftPtr] + nums[rightPtr] < 0 ){
                    lftPtr++;
                }
                //9. Continue to next conisdered value.
            }
        }

        return resultList;
    }
}
