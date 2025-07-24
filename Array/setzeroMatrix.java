public class setzeroMatrix{
    public static void main(String[] args){
        int[][] arr = {{1,0,1},{0,1,1},{1,1,1}};

        setMatrix(arr);
    }
    static void setMatrix(int[][] arr){
        int[] row = new int[arr.length];  //find the length of row in matrix
        int[] col = new int[arr[0].length];  // find the length of column in matrix

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){  // check if which index have '0' then store a '1' on row & col array
                if(arr[i][j]==0){
                    row[i]=1;  // 1,1,0
                    col[j]=1;  // 1,1,0
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j] = 0;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }


    }
}