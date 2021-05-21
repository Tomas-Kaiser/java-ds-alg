package stacks.hashTables;

import java.util.Arrays;

public class HashTableLin {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    private Entry[] entries;
    private int count;

    public HashTableLin(int size) {
        this.entries = new Entry[size];
    }

    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        if (isFull())
            throw new IllegalStateException();

        entries[getIndex(key)] = new Entry(key, value);
        count++;
    }

    public Entry getEntry(int key) {
        int index = getIndex(key);

        return index >= 0 ? entries[index] : null;
    }

    private int getIndex(int key) {
        int steps = 0;

        while (steps < entries.length) {
            int index = index(key, steps++);
            var entry = entries[index];
            if (entry == null || entry.key == key) {
                return index;
            }
        }

        return -1;
    }

    private int index(int key, int i) {
        return (hash(key) + i) % entries.length;
    }

    private int hash(int key) {
        return key % entries.length;
    }

    private boolean isFull() {
        return count == entries.length;
    }

    @Override
    public String toString() {
        return "HashTableLin{" +
                "entries=" + Arrays.toString(entries) +
                '}';
    }
}
