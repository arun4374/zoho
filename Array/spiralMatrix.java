import java.util.*;

public class spiralMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        spiralMatrix(matrix);

    }
    static void spiralMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);
            }
            right--;
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }

        System.out.println(list);
    }
}
