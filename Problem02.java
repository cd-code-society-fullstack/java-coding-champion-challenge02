import java.util.Arrays;

public class Problem02 {
    public static int countAnagramSubstrings(String s, String t) {
        if (s.length() < t.length()) return 0;

        int[] tCount = new int[26]; // assuming only lowercase English letters
        for (char c : t.toCharArray()) {
            tCount[c - 'a']++;
        }

        int[] sCount = new int[26];
        for (int i = 0; i < t.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        int count = Arrays.equals(tCount, sCount) ? 1 : 0;

        for (int i = t.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++; // add new char in sliding window
            sCount[s.charAt(i - t.length()) - 'a']--; // remove last char of previous window

            if (Arrays.equals(tCount, sCount)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input1 = args[0];
        String input2 = args[1];
        System.out.println(countAnagramSubstrings(input1, input2));
    }  
}
