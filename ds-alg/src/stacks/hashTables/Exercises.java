package stacks.hashTables;

import java.util.*;

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

//    Input: [1, 7, 5, 9, 2, 12, 3] K=2
//    Output: 4
//    (1, 3), (3, 5), (5, 7), (7, 9)
    public int countPairsWithDiff(int[] items, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : items)
            set.add(num);

        int count = 0;
        for (int num : items){
            if (set.contains(num - k))
                count++;
            if (set.contains(num + k))
                count++;
            set.remove(num);
        }

        return count;


//      This solution is O(n^2)
//        Map<Integer, Integer> pairs = new HashMap<>();
//
//        // sort
//        Arrays.sort(items);
//
//        System.out.println(Arrays.toString(items));
//
//        for (int i = 0; i < items.length - 1; i++) {
//            for (int j = 1; j < items.length; j++) {
//                if (Math.abs(items[i] - items[j]) == k) {
//                    if (!pairs.containsKey(i))
//                        pairs.put(items[i], items[j]);
//                    else if (!(pairs.get(i) == items[j]))
//                        pairs.put(items[i], items[j]);
//                }
//            }
//        }
//
//        System.out.println(pairs);
//
//        return pairs.size();
    }
}
