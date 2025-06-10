
 import java.util.*;
public class startwitha {
    public static List<Integer> getWordLengths(List<String> words) {
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            lengths.add(word.length());
        }
        return lengths;
    }
    public static int countStartsWithA(List<String> words) {
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty() && (word.charAt(0) == 'A' || word.charAt(0) == 'a')) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("damini", "arshita", "vanshika", "astha", "Anu", "Anurag");
        List<Integer> lengths = getWordLengths(words);
        System.out.println("Word lengths: " + lengths);

        int countA = countStartsWithA(words);
        System.out.println("Number of strings starting with 'A' or 'a': " + countA);
    }
}