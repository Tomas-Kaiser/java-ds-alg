package arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int size) {
        this.items = new int[size];
        this.count = 0;
    }

    public void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count++] = item;
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
