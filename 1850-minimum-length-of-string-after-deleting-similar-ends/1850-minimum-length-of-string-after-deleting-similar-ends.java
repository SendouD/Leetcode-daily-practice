class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                char current = s.charAt(left);

                while (left < right && s.charAt(left) == current) {
                    left++;
                }

                while (left <= right && s.charAt(right) == current) {
                    right--;
                }
            } else {
                break;
            }
        }

        return Math.max(0, right - left + 1);
    }
}