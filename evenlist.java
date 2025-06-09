
    import java.util.*;
public class evenlist {
    public static List<Integer> getEvenSquares(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                result.add(num * num);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> squares = getEvenSquares(nums);
        System.out.println("Squares of even numbers: " + squares);
    }
}

