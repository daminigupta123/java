import java.util.*;
public class uppercase {
    public static List<String> getUppercaseNames(List<String> names) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.length() > 3) {
                result.add(name.toUpperCase());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("vanshika", "harshita", "Anu", "Damini", "Bhola");
        List<String> upperNames = getUppercaseNames(names);
        System.out.println("Uppercase names with more than 3 characters: " + upperNames);
    }
}

