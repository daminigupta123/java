import java.util.Arrays;

public class movearray {
     public static void main(String[] args) {
        int[] arr = {7, -4, 6, -3, 9, 1, -2, 0};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                        int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Array after moving negatives to beginning:");
        System.out.println(Arrays.toString(arr));
    }
}

