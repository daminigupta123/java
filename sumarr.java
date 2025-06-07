import java.util.Scanner;
public class sumarr {
           public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 7, 2, 5, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sum to find pairs: ");
        int sum = sc.nextInt();

        System.out.println("Pairs with sum " + sum + ":");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        sc.close();
    }
}

