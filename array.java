import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int sum=0;
        int []arr=new int[n];
        
        System.out.println("enter valuse of array");
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        
        }
       /* int a=sc.nextInt();
        int[] arr={1,2,3,4,5};
        int a=50;
        System.out.println(a);
         */
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
     sum =sum+arr[i];
        }
        System.out.println(sum);}
        
       
       


    }


