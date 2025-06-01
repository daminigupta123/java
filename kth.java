import java.util.Arrays;

public class kth {
    
    public static void main(String[] args){
          int[] arr = {7, 4, 6, 3, 9, 1};
        int k = 2;
        Arrays.sort(arr);
        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];
        System.out.println(k + "th minimum element: " + kthMin);
        System.out.println(k + "th maximum element: " + kthMax);
    }
}
