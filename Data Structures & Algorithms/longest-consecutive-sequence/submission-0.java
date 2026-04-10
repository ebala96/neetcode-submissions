class Solution {
    public int longestConsecutive(int[] nums) {
        // 1. Create a set to avoid duplicates
        Set<Integer> numSet = new HashSet<>();
        // 2. Add every element to the set
        for(int num: nums){
            numSet.add(num);
        }
        
        int longestSequence = 0;
        for(int num: nums){
            // 3. Check if left element of the number exists. If so we skip to next element
            // Because left element present means, we can create the sequence when visisting left element
            if(!numSet.contains(num - 1)){

                // 4. If we find a new element which does not have a left element,
                // we check if right element is present
                // we increment till we find the sequence values in the set
                int rightElementSequence = 1;
                while(numSet.contains(num + rightElementSequence)){
                    rightElementSequence ++;
                }
                
                // check which of the current sequence and last found sequence is the longest
                longestSequence = Math.max(longestSequence, rightElementSequence);
            }
        }

        return longestSequence;
    }
}
