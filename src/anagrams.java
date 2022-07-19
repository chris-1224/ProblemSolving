
// Problem 9  -> Anagrams using Histogramming

public class anagrams {

    public static boolean areAnagram2(
            String first, String second) {
        // Check condition
        if (first == null || second == null)
            return false;

        final int ENGLISH_ALPHABET = 26; // ASCII format
        int[] frequencies = new int[ENGLISH_ALPHABET];

        first = first.toLowerCase();
        for (var i = 0; i < first.length(); i++)
            frequencies[first.charAt(i) - 'a']++; // 'a' starts @ 97

        second = second.toLowerCase();
        for (var i = 0; i < second.length(); i++) {
            var index = second.charAt(i) - 'a';
            if (frequencies[index] == 0)
                return false;

            frequencies[index]--;
        }

        return true;
    }

    public static void main(String[] args) {
        anagrams result = new anagrams();
        var anagram_result = areAnagram2("cat", "TA");
        System.out.println(anagram_result);
    }

}
