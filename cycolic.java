import java.util.Arrays;
public class cycolic {
      public static void main(String[] args) {
        int[] arr = {7, -4, 6, -3, 9, 1, -2, 0};
         int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println("Array after cyclic rotation by one:");
        System.out.println(Arrays.toString(arr));
}
}
