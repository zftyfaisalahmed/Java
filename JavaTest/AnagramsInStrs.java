package JavaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AnnaGrams {

    boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (!visited[i]) {
                ArrayList<String> group = new ArrayList<>();
                group.add(strs[i]);
                visited[i] = true;

                for (int j = i + 1; j < strs.length; j++) {
                    if (!visited[j] && isAnagram(strs[i], strs[j])) {
                        group.add(strs[j]);
                        visited[j] = true;
                    }
                }
                result.add(group);
            }
        }
        return result;
    }
}

public class AnagramsInStrs {
    public static void main(String[] args) {
        String[] strs = { "cat", "tea", "tan", "ate", "nat", "bat" };

        AnnaGrams an = new AnnaGrams();
        List<List<String>> groupedAnagrams = an.groupAnagrams(strs);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}
