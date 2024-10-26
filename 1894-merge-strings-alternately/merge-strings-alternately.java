class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        // Alternate characters from both strings until one of them is fully processed
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        // Append the remaining characters from word1, if any
        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }

        // Append the remaining characters from word2, if any
        while (j < word2.length()) {
            sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }
}
