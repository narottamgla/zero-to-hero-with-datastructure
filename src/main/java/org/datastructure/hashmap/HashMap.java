package org.datastructure.hashmap;

public class HashMap<K, V> {

    int capacity;
    int loadFactor;
    int size;
    Node[] table;


    public HashMap() {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.size = 0;
        this.table = new Node[capacity];
    }

    public void put(K key, V value) {
        int index = getHash(key);
        Node<K, V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        Node<K, V> newNode = new Node<>(key, value, null);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
        if (size > capacity * loadFactor) {
            resize();
        }
    }

    private void resize() {
        int newCapacity = capacity * 2;
        Node<K, V>[] newTable = new Node[newCapacity];
        for (int i = 0; i < capacity; i++) {
            Node<K, V> node = table[i];
            while (node != null) {
                int index = node.key.hashCode() % newCapacity;
                Node<K, V> nextNode = node.next;
                node.next = newTable[index];
                newTable[index] = node;
                node = nextNode;
            }
        }
        table = newTable;
        capacity = newCapacity;
    }

    public <V> Object get(K key) {

        int index = getHash(key);
        Node<K, V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public V getOrDefault(K key, V defaultValue) {
        V value = (V) get(key);
        return (value != null) ? value : defaultValue;
    }

    public int getHash(K key) {
        return key.hashCode() % capacity;
    }


    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }


}
