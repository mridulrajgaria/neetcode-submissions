class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int area=-1;
        while(i<j){
            int currarea=Math.min(heights[i],heights[j])*(j-i);
            area=Math.max(area,currarea);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;
        
    }
}
