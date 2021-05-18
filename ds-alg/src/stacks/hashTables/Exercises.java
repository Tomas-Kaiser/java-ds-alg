package stacks.hashTables;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

//    input: [1, 2, 2, 3, 3, 3, 4]
//    output: 3
    public int mostFrequent(int[] items) {
        if (items.length == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int item : items) {
            int count = !map.containsKey(item) ? 0 : map.get(item);
            map.put(item, count + 1);
        }

        int theMostFrequent = 0;
        for (var entry : map.entrySet()) {
            if (entry.getValue() > theMostFrequent){
                theMostFrequent = entry.getValue();
            }
        }

        return theMostFrequent;
    }
}
