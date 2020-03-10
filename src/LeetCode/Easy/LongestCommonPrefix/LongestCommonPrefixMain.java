package LeetCode.Easy.LongestCommonPrefix;

public class LongestCommonPrefixMain {
    public static void main(String[] args) {
        String[] input = new String[]{"a"};
        String result;
        result = longestCommonPrefix(input);
        System.out.println("result = " + result);
    }

    private static String longestCommonPrefix(String[] input) {
        System.out.println("input.length = " + input.length);
        int n = input[0].length();
        char temp;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            temp = input[0].charAt(i);
            for (String s : input) {
                if (s.length() < n) {
                    n = s.length();
                }
            }

        }
        return result.toString();

    }
}
