//https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/?envType=daily-question&envId=2023-12-13
public class Question1582 {
    public static int numSpecial(int[][] mat) {
        int count=0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && fun(i,j,n,m,mat)){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean fun(int i, int j ,int n , int m , int[][] c){
        for(int k=0;k<m;k++){
            if(k!=j && c[i][k]==1){
                return false;
            }
        }
        for(int k=0;k<n;k++){
            if(k!=i && c[k][j]==1){
                return false;
            }
        }
        return true;
    }
}
