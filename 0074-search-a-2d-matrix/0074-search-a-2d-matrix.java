class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length-1;
        int i=0;
        while(i<matrix.length && n>=0){

        if(matrix[i][n]==target){
        return true;}

        else if(matrix[i][n]<target){
            i++;
        }
        else if(matrix[i][n]>target){
           n--;}
        }
        return false;


        
    }
}