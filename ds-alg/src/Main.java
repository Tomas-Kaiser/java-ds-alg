import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // should return 54421
        System.out.println(sortDesc(42145));
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
