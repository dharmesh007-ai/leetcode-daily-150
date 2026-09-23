class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> map=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                String s1=""+board[i][j]+"in row"+i;
                String s2=""+board[i][j]+"in column"+j;
                String s3=""+board[i][j]+"in box"+i/3+""+j/3;

                if(map.contains(s1) || map.contains(s2) || map.contains(s3)){
                    return false;
                }
                map.add(s1);
                map.add(s2);
                map.add(s3);
            }

        }
        return true;
    }
}