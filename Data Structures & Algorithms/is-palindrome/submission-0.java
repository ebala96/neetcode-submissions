class Solution {
    public boolean isPalindrome(String s) {
        // 1. Use two pointers
        int lftPtr = 0;
        int rightPtr = s.length() - 1;
        
        // 2. Continue till we reach the middle
        while(lftPtr < rightPtr){
            // 3. Check if left value is valid input. Else go to next left char
            while(lftPtr < rightPtr && !isAlphaNumeric(s.charAt(lftPtr))){
              lftPtr++;
            }
            
            // 3. Check if right value is valid input. Else go to next right char
            while(rightPtr > lftPtr  && !isAlphaNumeric(s.charAt(rightPtr))){
              rightPtr--;
            }
            
            // 4. Character compare
            if(Character.toLowerCase(s.charAt(lftPtr)) != Character.toLowerCase(s.charAt(rightPtr))){
                return false;
            }

            // 5. Increment left and decrement right and continue.
            lftPtr++; rightPtr--;
        }

        return true;

        
    }

    public boolean isAlphaNumeric(char c){
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
}
