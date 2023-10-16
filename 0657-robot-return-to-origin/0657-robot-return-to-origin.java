class Solution {
    public boolean judgeCircle(String moves) {
        int h=0;int v=0;
        char[] moveArray = moves.toCharArray();
        for(char j: moveArray){
            if(j=='L'){
                h++;
            }
            else if(j=='R'){
                h--;
            }
            else if(j=='U'){
                v++;
            }
            else{
               v--;
            }
            
        }
        if(h==0&&v==0){
            return true;
        }
else return false;
        
    }
}