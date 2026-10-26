public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        int maxLength = 0;
        int l = 0,r=0;
        for ( r = 0; r < s.length(); r++) {
            char c = s.charAt(r
            );
            if (lastIndex[c] >= l) {
                l = lastIndex[c] + 1;
            }
            lastIndex[c] = r;
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
