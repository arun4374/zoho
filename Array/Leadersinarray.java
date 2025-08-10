import java.util.*;

public class Leadersinarray {
    public static void main(String[] args){
        int[] arr = {5,10,3,4,1};

        
       for(int i=0;i<arr.length-1;i++){
            boolean isLeader = true;
            for(int j=1;j<arr.length;j++){
                if(arr[i+1] > arr[i]){
                    isLeader = false;
                    break;
                }
            }

            if(isLeader){
                System.out.print(arr[i]+",");
            }
       }
       int max = arr[arr.length-1];
        System.out.print(max + ",");

        //optimised solution ------>

        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
       int maxLeader = -99;
        for(int i=n;i>0;i--){
            if(arr[i-1] > maxLeader){
                list.add(arr[i-1]);
                maxLeader = arr[i-1];
            }
        }
        Collections.reverse(list);

        System.out.print(list);

    }
}
