class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        int[] s1char = new int[26];
        int[] s2char = new int[26];
        
        // 1. Create two charcter array and fill it with s1 character counts
        for(int i = 0; i < s1.length(); i++){
            s1char[s1.charAt(i) - 'a']++;
            s2char[s2.charAt(i) - 'a']++;
        }

        int matches = 0, l = 0;
        
        // 2. Increment the matches count for every match found in both arrays for every 26 character 
        for(int i = 0; i < 26; i++){
            if(s1char[i] == s2char[i]){
                matches++;
            }
        }
        
        // 3. Use the sliding window to check each window and see if char arrays matches equal 26
        for(int r = s1.length(); r < s2.length(); r++){
            if(matches == 26){
                return true;
            }
            
            // 4. Increment every character index at s2.charAt(r)
            int index = s2.charAt(r) - 'a';
            s2char[index]++;
            // 5. Change the matches count comparing both arrays
            if(s1char[index] == s2char[index]){
                matches++;
            }else if(s1char[index] + 1 == s2char[index]){
                matches--;
            }
            
            // 6. Decrement every character index at s2.charAt(l)
            index = s2.charAt(l) - 'a';
            s2char[index]--;
            // 7. Change the matches count comparing both arrays
            if(s1char[index] == s2char[index]){
                matches++;
            }else if(s1char[index] - 1 == s2char[index]){
                matches--;
            }
            
            // 8. Change the left counter to keep the window of same size and continue till we find the match
            l++;

        }

        return matches == 26;
        
    }
}
