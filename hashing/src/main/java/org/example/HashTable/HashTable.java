package org.example.HashTable;

import java.util.HashMap;
import java.util.Map;

public class HashTable {
    private Map<Integer, HashTableElements> elements = new HashMap<>();

    public void addList(int k, HashTableElements list) {
        this.elements.put(k, list);
    }

    public HashTableElements getList(int k) {
        return this.elements.get(k);
    }

    public void removeList(int k) {
        this.elements.remove(k);
    }
}
