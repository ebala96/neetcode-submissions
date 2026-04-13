class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // 1. Init the hashset and left pointer
        HashSet subString = new HashSet<>();
        int leftPtr = 0;
        int longestSubStr = 0;
        
        // 2. Loop the right pointer using for loop
        for(int r = 0; r < s.length(); r++){
            // 3. Check if the current right value is present in hash set
            while(subString.contains(s.charAt(r))){
                // 4. If present remove current character at left pointer and increment left pointer 
                subString.remove(s.charAt(leftPtr));
                leftPtr++;
            }
            // 5. If not present add the charcter and right pointer to the hashset.
            subString.add(s.charAt(r));
            // 6. Calculate the current substring and find the max between previous found substring lenght and current sub string lenght.
            longestSubStr = Math.max(longestSubStr, (r - leftPtr) +1);
            //7. Continue till we reach the last character
        }

        return longestSubStr;
        
    }
}
