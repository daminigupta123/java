
import java.util.*;
public class duplicate {
    public static int findDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num; // Return the first duplicate found
            }
            seen.add(num);
        }
        return -1; // No duplicate found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 3};
        int duplicate = findDuplicate(arr);
        if (duplicate != -1) {
            System.out.println("Duplicate number is: " + duplicate);
        } else {
            System.out.println("No duplicate found.");
        }
    }
}