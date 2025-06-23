public class Leadersinarray {
    public static void main(String[] args){
        int[] arr = {5,10,3,4,1};

        int max = -99;
        for(int i=1;i<=arr.length;i++){
            if(arr[arr.length-i]>max){
                max = arr[arr.length-i];
                System.out.print(max+",");
            }
        } 
    }
}
