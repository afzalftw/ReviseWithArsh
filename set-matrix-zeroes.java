// https://leetcode.com/problems/set-matrix-zeroes/submissions/985398379/
class Solution {
    static void set(int[][] a,int x,int y){
        for(int i=0;i<a[0].length;i++) a[x][i]=0;  
        for(int i=0;i<a.length;i++) a[i][y]=0;
    }
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    h.add(String.valueOf(i)+"+"+String.valueOf(j));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0&&h.contains(String.valueOf(i)+"+"+String.valueOf(j))){
                    set(matrix,i,j);
                }
            }
        }
    }
}
