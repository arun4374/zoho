<<<<<<< HEAD
import java.util.Scanner;

public class zlpattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<=n;i++){
            int temp = i;
            for(int j=0;j<i;j++){
                System.out.print(temp+" ");
                temp = temp + n-j-1;
            }
            System.out.println();
        }
    }
=======
import java.util.Scanner;

public class zlpattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<=n;i++){
            int temp = i;
            for(int j=0;j<i;j++){
                System.out.print(temp+" ");
                temp = temp + n-j-1;
            }
            System.out.println();
        }
    }
>>>>>>> 6538695f7751440e06120f7da75ffc29286a5f79
}