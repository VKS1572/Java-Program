//leetcode 383 question

public class NewOne {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check ransomNote characters
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false;
            }
            freq[c - 'a']--;
        }

        return true;
    }
}
