import java.util.HashSet;
import java.util.Set;

public class Problem01 {
    public static int countDistinctSubstrings(String s) {
        Set<String> substrings = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                substrings.add(s.substring(i, j));
            }
        }

        return substrings.size();
    }

    public static void main(String[] args) {
        String input1 = args[0];
        System.out.println(countDistinctSubstrings(input1)); // Outputs: 6
    }    
}
