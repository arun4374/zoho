<<<<<<< HEAD
public class maxSubarray{
    public static void main(String[] args){
        int[] nums = {1,2,3,2,1,-6};

       System.out.println(findmaxSubarray(nums));
    }

    static int findmaxSubarray(int[] nums){
        int max=nums[0];
        int sum;
        int n =nums.length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                max = Math.max(max,sum);
            }

        }
        return max;
    }
=======
public class maxSubarray{
    public static void main(String[] args){
        int[] nums = {1,2,3,2,1,-6};

       System.out.println(findmaxSubarray(nums));
    }

    static int findmaxSubarray(int[] nums){
        int max=nums[0];
        int sum;
        int n =nums.length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                max = Math.max(max,sum);
            }

        }
        return max;
    }
>>>>>>> 6538695f7751440e06120f7da75ffc29286a5f79
}