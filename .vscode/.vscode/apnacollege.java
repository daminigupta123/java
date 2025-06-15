import java.util.Scanner;
public class apnacollege {
    
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
             String marks[]=new String [size];
             for(int i=0;i<size;i++){
                marks[i]=sc.next();
             }
        for(int i=0;i<size;i++)
        {
        System.out.println(marks[i]);
        }
    
    }
}
