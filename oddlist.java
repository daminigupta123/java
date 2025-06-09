
    
import java.util.*;
public class  oddlist {
    public static int sumOfOddNumbers(List<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
    
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 7);
        int oddSum = sumOfOddNumbers(numbers);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
