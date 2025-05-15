import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold sorted word as key, and list of anagrams as value
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert the word to character array, sort it, then convert back to string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Put the word in the map
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(word);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);

        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
