public class Solution {
    public List<String> printVertically(String s) {
        String[] arr = s.split(" ");
        int max = 0;

        for (String word : arr) {
            max = Math.max(max, word.length());
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            StringBuilder str = new StringBuilder();

            for (String word : arr) {
                if (i < word.length()) {
                    str.append(word.charAt(i));
                } else {
                    str.append(" ");
                }
            }

            result.add(trim(str.toString()));
        }

        return result;
    }

    String trim(String word) {
        int k = word.length();
        while (--k > -1) {
            if (word.charAt(k) != ' ') {
                return word.substring(0, k + 1);
            }
        }
        return null;
    }
}
