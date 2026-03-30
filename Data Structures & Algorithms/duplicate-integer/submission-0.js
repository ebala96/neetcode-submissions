class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let isSeen = new Set()
        for(const element of nums){
            if(isSeen.has(element)) 
            return true

            isSeen.add(element)
        }

        return false;
    }
}
