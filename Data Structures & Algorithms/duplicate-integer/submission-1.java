class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hasSeen = new HashSet<>();
        for(int num : nums){
            if(hasSeen.contains(num)) return true;

            hasSeen.add(num);
        }
        return false;
    }
}