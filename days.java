import java.util.Scanner;
public class days {
   public static void main(String[] args) {
    System.out.println("enter number to 1 to 7");
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    switch(a){
        case 1:System.out.println("sunday");
        break;
        case 2:System.out.println("monday");
        break;
        case 3:System.out.println("tuesday");
        break;
        case 4:System.out.println("wednesday");
        break;

    case 5:System.out.println("thursday");
    break;
case 6:System.out.println("friday");
break;
case 7:System.out.println("suturday");
break;
default: System.out.println("not found");
   } 
}
}
