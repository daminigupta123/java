import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter valuse of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        
        }
       /* int a=sc.nextInt();
        int[] arr={1,2,3,4,5};
        int a=50;
        System.out.println(a);
         */
        for(int k=0;k<arr.length;k++)
        System.out.println(arr[k]);
    }
}

