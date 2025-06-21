import java.util.Scanner;

public class CheckarraySorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int j=0;j<arr.length;j++){
            arr[j] = sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Array is not sorted");
                break;
            }
        }
        System.out.println("Array is sorted");
        sc.close();
    }
}