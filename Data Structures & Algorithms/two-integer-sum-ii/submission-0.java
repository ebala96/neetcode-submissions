class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 1. Init two pointers at first and last indexes
        int lftPtr = 0, rightPtr = numbers.length - 1;
         
        while(lftPtr < rightPtr){
            // 2. Check if the sum of the indexes is equal to target, if equal return indexes.
            if(numbers[lftPtr] + numbers[rightPtr] == target){
                return new int[] {lftPtr + 1, rightPtr + 1};
            }
            // 3. If sum is greater than target, decrement right pointer
            if(numbers[lftPtr] + numbers[rightPtr] > target){
                rightPtr--;
            }
            // 4. If sum is less than target, increment right pointer
            if(numbers[lftPtr] + numbers[rightPtr] < target){
                lftPtr++;
            }
        }
        return new int[0];       
    }
}
