import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // should return 54421
//        System.out.println(sortDesc(42145));

        /*
        * An isogram is a word that has no repeating letters,
        * consecutive or non-consecutive. Implement a function that
        * determines whether a string that contains only letters is an isogram.
        * Assume the empty string is an isogram. Ignore letter case.
        *
        * isIsogram "Dermatoglyphics" == true
        * isIsogram "aba" == false
        * isIsogram "moOse" == false -- ignore letter case
        * */
//        System.out.println(isIsogram("Dermatoglyphics"));
//        System.out.println(isIsogram("aba"));
//        System.out.println(isIsogram("moOse"));

//        System.out.println(Arrays.toString(stringSplit("abc")));
//        System.out.println(Arrays.toString(stringSplit("abcdef")));



    }

    public static String[] stringSplit(String s) {
        List<String> list = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < s.length(); i += 2) {
            String ch = String.valueOf(s.charAt(i));
            if (i != (s.length() - 1)) {
                list.add(index++, ch + s.charAt(i + 1));
            } else {
                list.add(index, ch + "_");
            }
        }

        return list.toArray(String[]::new);
    }

    public static boolean isIsogram(String str) {
//        Set<Character> set = new HashSet<>();
//        for (char ch : str.toLowerCase().toCharArray()) {
//            if (!set.contains(ch)) {
//                set.add(ch);
//            } else {
//                return false;
//            }
//        }
//
//        return true;
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static int sortDesc(final int num) {
        int temp = num;
        List<Integer> arr = new ArrayList<>();
        do {
            arr.add(temp % 10);
            temp /= 10;
        } while (temp != 0);

        System.out.println("----");
        System.out.println(arr);
        return 4;
    }
}
