import java.util.*;

//brute force  --------------->

public class Removeduplicate{
    static int removeduplicate(int[] arr){
           HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<arr.length;i++){
                    set.add(arr[i]);
                }
            int z = set.size();
            int j =0;
            for(int x:set){
                arr[j++]=x;
            }
            return z;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5,6,6};
     
        int k = removeduplicate(arr);

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


// Optimized solution ------------->

//public class Removeduplicate{
//     static int removeduplicate(int[] arr){
//         int i=0;
//         for( int j=1;j<arr.length;j++){
//             if(arr[i] != arr[j]){
//                 arr[i+1] = arr[j];
//                 i++;
//             }
//         }
//         return i+1;
//     }
//     public static void main(String[] args){
//         int[] arr = {1,1,2,3,3,4,4,5,5,6,};

//         int k = removeduplicate(arr);

//         for(int j=0;j<k;j++){
//             System.out.print(arr[j]+" ");
//         }
//     }
// }