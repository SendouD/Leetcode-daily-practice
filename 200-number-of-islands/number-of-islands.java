class Solution {
    public int count =0;
    public int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    Set<String> visited= new HashSet<>();


    public int numIslands(char[][] g) {
        int row=g.length;
        int col=g[0].length;
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                if(g[i][j]=='1'&& !visited.contains(i+","+j)){
                    count++;
                    bfs(g,i,j,row,col);
                }
            }
        }
        return count;
    }
    void bfs(char[][] g,int r ,int c,int rows,int cols){
        visited.add(r+","+c);
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
             int[] point=q.poll();
             int row=point[0];
             int col=point[1];
             for(int[] dir:directions){
                int nr=row+dir[0],nc=col+dir[1];
                if(nr>=0 && nr<rows && nc>=0 && nc<cols&& g[nr][nc]=='1' && !visited.contains(nr+","+nc)){
                    q.add(new int[]{nr,nc});
                    visited.add(nr+","+nc);
                }
             }
        }
    }
}