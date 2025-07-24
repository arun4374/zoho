public class LEA{
    static int isMax(int a[], int n){
    int max = a[0];
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(max < a[j]){
                    max = a[j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[] = {1,20,3,4,12,90,30,22};
        int n = arr.length;
        int Data = isMax( arr, n);
        System.out.print(Data);
    }
}