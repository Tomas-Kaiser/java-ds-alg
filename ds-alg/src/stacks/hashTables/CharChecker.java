package stacks.hashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharChecker {

    public char findFirstRepeatedCharacter(String str) {
        Set<Character> set = new HashSet<>();
        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (set.contains(ch)){
                return ch;
            }

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }

    public char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (char ch : chars) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }
}