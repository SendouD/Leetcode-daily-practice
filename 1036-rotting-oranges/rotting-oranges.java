class Solution {
    int[][] dirs={{1,0},{0,1},{-1,0},{0,-1}};
    
    public int orangesRotting(int[][] g) {
        Queue<int[]> q=new LinkedList<>();
        int min=0;
        int fresh=0;
        int rows=g.length;
        int cols=g[0].length;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(g[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        while(!q.isEmpty() && fresh!=0){
            int len=q.size();
            for(int i=0;i<len;i++){
                int[] point=q.poll();
                for(int[] dir:dirs){
                 int r = point[0] + dir[0];
                    int c = point[1] + dir[1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols && g[r][c] == 1) {
                        g[r][c] = 2; 
                        fresh--;
                        q.add(new int[]{r, c});
                    }
                }
            }
            min++;


        }
        return fresh == 0 ? min : -1;
        
    }
}