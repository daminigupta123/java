  import java.util.Scanner;
public class twopintr {
      public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 7, 2, 5, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sum to find subarray: ");
        int sum = sc.nextInt();
        int currSum = arr[0], start = 0;
        boolean found = false;
        for (int end = 1; end <= arr.length; end++) {

            while (currSum > sum && start < end - 1) {
                currSum -= arr[start];
                start++;
            }
                if (currSum == sum) {
                System.out.print("Subarray with given sum found from index " + start + " to " + (end - 1) + ": ");
                for (int i = start; i < end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                found = true;
                break;
            }
            if (end < arr.length)
                currSum += arr[end];
        }
        if (!found) {
            System.out.println("No subarray with given sum found.");
        }
        sc.close();
    }
}
    

