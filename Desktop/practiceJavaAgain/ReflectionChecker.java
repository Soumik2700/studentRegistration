public class ReflectionChecker {

    public static int isSameReflection(String word1, String word2) {
        // Check if both words have the same length
        if (word1.length() != word2.length()) {
            return -1;
        }

        // Concatenate word1 with itself
        String concatWord = word1 + word1;

        // Check if word2 is a substring of the concatenated word
        if (concatWord.contains(word2)) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        String word1 = "sample";
        String word2 = "plesam";

        int result = isSameReflection(word1, word2);
        System.out.println("Result: " + result); // Output: 1
    }
}
