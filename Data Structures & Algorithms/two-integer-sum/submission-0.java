class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexesMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diffVal = target - nums[i];
            if(indexesMap.containsKey(diffVal)){
                return new int[] { indexesMap.get(diffVal), i};
            }else{
                indexesMap.put(nums[i], i);
            }
        }

        return new int[] {};
        
    }
}
