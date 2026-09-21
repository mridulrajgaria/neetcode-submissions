class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] num=new int[nums.length];
        int prod=1;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                prod*=nums[i];
            }else{
                zero++;
            }

        }
        for(int i=0;i<num.length;i++){
            if(zero==0){
                num[i]=prod/nums[i];
            }
            else if(zero==1){
                if(nums[i]==0){
                    num[i]=prod;
                }else{
                    num[i]=0;
                }
            }else{
                num[i]=0;
            }
        }
        return num;
    }

}
