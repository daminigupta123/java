public class sorarr {
        public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }
        return count == 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2}; 
        int[] arr2 = {1, 2, 3, 4, 5}; 
        int[] arr3 = {2, 1, 3, 4, 5}; 

        System.out.println(isSortedAndRotated(arr1)); 
        System.out.println(isSortedAndRotated(arr2)); 
        System.out.println(isSortedAndRotated(arr3)); 
}
}
