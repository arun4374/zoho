<<<<<<< HEAD
public class rotateMat {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        rotateMat(matrix);
    }
    static void rotateMat(int[][] mat){

        for(int z=1;z<2;z++) {
            int n = mat[0].length;
            int m = mat.length;
            for (int i = 0; i < m - 1; i++) {
                for (int j = i; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < (n / 2); j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][n - i - 1];
                    mat[i][n - i - 1] = temp;
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(mat[i][j]+"  ");
                }
                System.out.println();
            }
        }


    }

}
=======
public class rotateMat {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        rotateMat(matrix);
    }
    static void rotateMat(int[][] mat){

        for(int z=1;z<2;z++) {
            int n = mat[0].length;
            int m = mat.length;
            for (int i = 0; i < m - 1; i++) {
                for (int j = i; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < (n / 2); j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][n - i - 1];
                    mat[i][n - i - 1] = temp;
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(mat[i][j]+"  ");
                }
                System.out.println();
            }
        }


    }

}
>>>>>>> 6538695f7751440e06120f7da75ffc29286a5f79
