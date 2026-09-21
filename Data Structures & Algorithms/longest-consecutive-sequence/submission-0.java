class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> se=new HashSet<>();
        for(int num:nums){
            se.add(num);
        }
        int longest=0;
        for(int num:se){
            if(!se.contains(num-1)){
                int length=1;
                while(se.contains(num+length)){
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
