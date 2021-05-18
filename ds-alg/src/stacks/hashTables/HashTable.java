package stacks.hashTables;

import java.util.LinkedList;

public class HashTable {
    // put(k,v)
    // get (k): v
    // remove(k)
    // k: int
    // v: String
    // Collisions: chaining
    // LinkedList<Entry>
    // [ll, ll, ll, ll]

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries;
    private int size;

    public HashTable(int size) {
        this.entries = new LinkedList[size];
        this.size = size;
    }

    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).addLast(new Entry(key, value));
    }

    public String get(int key){
        var entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

    public void remove(int key){
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        for (var entry : bucket) {
            if (entry.key == key) {
                return entry;
            }
        }

        return null;
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null)
            entries[index] = new LinkedList<>();

        return bucket;
    }


    public void print() {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) continue;

            for (int j = 0; j < entries[i].size(); j++){
                System.out.print("index: " + i + ": [");
                System.out.print("key=" + entries[i].get(j).key);
                System.out.print(", value=" + entries[i].get(j).value);
                System.out.println("]");
            }
        }
    }

    private int hash(int key) {
        return Math.abs(key) % this.size;
    }
}
