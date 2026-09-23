class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> cset=new HashSet<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            while(cset.contains(s.charAt(right))){
                cset.remove(s.charAt(left));
                left++; 
            }
            cset.add(s.charAt(right));
            maxLength=Math.max(maxLength,(right-left+1));
        }
        return maxLength;

        
    }
}
