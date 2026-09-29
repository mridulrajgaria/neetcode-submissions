class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int pile:piles){
            max=Math.max(max,pile);
        }
        while(min<max){
            int mid=min+(max-min)/2;
            if(eat(piles,h,mid)){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;

    }
    public boolean eat(int[] piles,int h,int mid){
        int hours=0;
        for(int pile:piles){
            hours+= (int)Math.ceil((double)pile / mid);
        }
        return hours<=h;
    }
}
