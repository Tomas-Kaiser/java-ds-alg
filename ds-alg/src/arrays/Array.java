package arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int size) {
        this.items = new int[size];
        this.count = 0;
    }

    public int max() {
        int max = 0;
        for (int item : items) {
            if (item > max) max = item;
        }

        return max;
    }

    public Array intersect(Array other) {
        Array common = new Array(count);

        for (int item : items) {
            if (other.indexOf(item) >= 0){
                common.insert(item);
            }
        }

        return common;
    }

    public Array reverse(){
        var reversed = new Array(count);
        for (int i = count - 1; i >= 0; i--) {
            reversed.insert(items[i]);
        }

        return reversed;
    }

    public void insertAt(int index){
        // resize array if needed

        // shift items to the right

        // insert the item in proposed index
    }

    public void insert(int item) {
        resize();

        items[count++] = item;
    }

    private void resize() {
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
    }

    public int indexOf(int item) {

        for (int i = 0; i < count; i++){
            if (items[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public void removeAt(int index) {
        if (index >= count || index < 0) {
            throw new IllegalArgumentException();
        }

        shiftLeft(index);
    }

    private void shiftLeft(int index) {
        for (int i = index; i < count; i++){
            if (i + 1 < count) {
                items[i] = items[i + 1];
            }
        }
        count--;
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
