public class remove{
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "damini";
        String output = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + output);
    }
}
