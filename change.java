 import java.util.*;
public class change {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
              for (int num : arr) {
            if (num >= 0)
                pos.add(num);
            else
                neg.add(num);
        }
        int i = 0, p = 0, ne = 0;
                while (p < pos.size() && ne < neg.size()) {
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(ne++);
        }
     while (p < pos.size()) arr[i++] = pos.get(p++);
            while (ne < neg.size()) arr[i++] = neg.get(ne++);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -4, -1, 6, -9, -7, 1};
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}

