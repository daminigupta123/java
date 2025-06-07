
    
import java.util.Scanner;

public class countaccur {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 7, 2, 5, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to count: ");
        int x = sc.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        System.out.println("Occurrences of " + x + ": " + count);
        sc.close();
    }
}