class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for(int right = 0; right < n; right++) {
            if(!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLen = Math.max(maxLen, right-left+1);
            } else {
                while(charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxLen;
    }
}