import java.util.*;
public class lengofwords {
    public static List<Integer> getWordLengths(List<String> words) {
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            lengths.add(word.length());
        }
        return lengths;
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("damini", "harshita", "vanshika", "astha");
        List<Integer> lengths = getWordLengths(words);
        System.out.println("Word lengths: " + lengths);
    }
} 

