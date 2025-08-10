// public class test{
//     static void sortArray(int[] num){
//         int n = num.length;

//         for(int i=0;i<n;i++){
//             int min = i;
//             for(int j=i+1;j<=n-1;j++){
//                 if(num[min]>num[j]){
//                     min = j;
//                 }
//             }
//             int temp = num[i];
//             num[i] = num[min];
//             num[min] = temp;
//         }
//         for(int x:num){
//             System.out.print(x+" ");
//         }
//     }
//     public static void main(String[] args){
//         int[] num = {100,12,3,6,2,1};

//         sortArray(num);
//     }
// }



public class squareandSort {
    public static void main(String[] args){
        int[] num ={-4,-1,3,2,10};

        sortsqArray(num);
    }
    static void sortsqArray(int[] num){
        int n = num.length;
        int[] list = new int[n];

        int left = 0;
        int right = n-1;

        for(int i=right;i>=left;i--){
            if(num[left] > num[right]){
                list[i] = Math.abs(left)*Math.abs(left);
                left++;
            }else{
                list[i] = Math.abs(right)*Math.abs(right);
                right--;
            }
        }

        for(int x:list){
            System.out.print(x+" ");
        }
    }
}
