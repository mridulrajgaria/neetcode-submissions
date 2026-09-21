class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[] rows=new HashSet[n];
        HashSet<Character>[] cols=new HashSet[n];
        HashSet<Character>[] box=new HashSet[n];
        for(int i=0;i<n;i++){
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            box[i]=new HashSet<Character>();
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char cell=board[i][j];
                if(cell=='.'){
                    continue;
                }
                if(rows[i].contains(cell)){
                    return false;
                }
                rows[i].add(cell);
                if(cols[j].contains(cell)){
                    return false;
                }
                cols[j].add(cell);
                int boxi=3*(i/3)+(j/3);
                if(box[boxi].contains(cell)){
                    return false;
                }
                box[boxi].add(cell);
            }
        }
        return true;
    }
}
