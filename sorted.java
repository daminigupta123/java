
    public class sorted {
    // Merge arr1 and arr2 in-place without using extra space
    public static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = n - 1, j = 0;

        // Swap largest of arr1 with smallest of arr2
        while (i >= 0 && j < m && arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            i--;
            j++;
        }

        // Sort both arrays to maintain sorted order
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        mergeSortedArrays(arr1, arr2);

        System.out.print("arr1: ");
        for (int num : arr1) System.out.print(num + " ");
        System.out.println();
        System.out.print("arr2: ");
        for (int num : arr2) System.out.print(num + " ");
    }
}
    

