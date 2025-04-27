class Solution {
    public int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    Set<String> visited=new HashSet<>();
    public int maxAreaOfIsland(int[][] g) {
        
        int rows=g.length;
        int cols=g[0].length;
        int result=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            
            if(!visited.contains(i+","+j)&& g[i][j]==1){
                int min=bfs(i,j,rows,cols,g);
                result=Math.max(result,min);
                }
            }
        }
        return result;


        
    }
    public int bfs(int r,int c,int rows,int cols,int[][] g){
        int len=1;
        visited.add(r+","+c);
        Queue<int[]> q=new LinkedList<>();
        // Queue<int[]> q= new LinkedList<>();

        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int points[]=q.poll();
            for(int[] dir:dirs){
                int nr=points[0]+dir[0] ;
                int nc=points[1]+dir[1];
                if(nr>=0 && nr<rows && nc>=0 && nc<cols && g[nr][nc]==1 && !visited.contains(nr+","+nc)){
                        q.add(new int[]{nr,nc});
                        len++;
                        visited.add(nr+","+nc);
                       }
            }
        }
        return len;
    }
}