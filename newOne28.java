class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet to store characters in the current window
        Set<Character> set = new HashSet<>();
        
        int left = 0, right = 0, maxLen = 0;
        
        while (right < s.length()) {
            char c = s.charAt(right);
            
            // If char already exists, shrink window from left until it's removed
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        
        return maxLen;
    }
}
