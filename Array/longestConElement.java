<<<<<<< HEAD
public class longestConElement{
    public static void main(String[] args){
        int[] arr = {100,4,200,1,3,2};

        secSort(arr);
        int cnt =0;
        int z = 0;
        int max = 0;
        for(int i=arr[0];i<arr.length;i++){   //1,2,3,4,100,200
                if(i==arr[z]){
                    cnt++;
                }else{
                    if(max<cnt){
                        max = cnt;
                    }
                }
                z++;
        }
        System.out.println(max);
    }

   static void secSort(int[] arr){

        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    

    
=======
public class longestConElement{
    public static void main(String[] args){
        int[] arr = {100,4,200,1,3,2};

        secSort(arr);
        int cnt =0;
        int z = 0;
        int max = 0;
        for(int i=arr[0];i<arr.length;i++){   //1,2,3,4,100,200
                if(i==arr[z]){
                    cnt++;
                }else{
                    if(max<cnt){
                        max = cnt;
                    }
                }
                z++;
        }
        System.out.println(max);
    }

   static void secSort(int[] arr){

        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    

    
>>>>>>> 6538695f7751440e06120f7da75ffc29286a5f79
}