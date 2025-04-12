import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        
    System.out.println("entre a char"); 
    Scanner in=new Scanner(System.in);
    char c=in.next().charAt(0);
    switch(c)
    {
        case 'A':System.out.println("vowel"); 
        break;
        case 'E':System.out.println("vowel");
        break;
        case 'I':System.out.println("vowel");
        break;
        case 'O':System.out.println("vowel");
        break;
        case 'U':System.out.println("vowel");
        break;
        default:
        System.out.println("CONSUNANT");
        }
    }

    }

    
    
    

