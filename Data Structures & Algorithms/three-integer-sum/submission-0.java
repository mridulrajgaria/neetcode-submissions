class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> output = new HashSet<>();
        for(int i =0; i< nums.length -2; i++){
            int j = i+1;
            int k = nums.length -1;
            List<Integer> tripLet = new ArrayList<>();
            
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    tripLet.add(nums[i]);
                    tripLet.add(nums[j]);
                    tripLet.add(nums[k]);
                    output.add(new ArrayList<>(tripLet));
                    j++;
                    k--;
                    tripLet.clear();
                }
                if(sum < 0){
                    j++;
                }
                if(sum > 0){
                    k--;
                }

            }
        }
        

      return new ArrayList<List<Integer>> (output);  
        
    }
}