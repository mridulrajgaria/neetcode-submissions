class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] n=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int x=stack.pop();
                n[x]=i-x;
            }   
            stack.push(i);
        }
        return n;
        
    }
}
