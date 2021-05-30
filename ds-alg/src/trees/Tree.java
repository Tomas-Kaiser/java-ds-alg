package trees;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            root = node;
            return;
        }

        Node current = root;
        while (current != null) {
            if (current.value > node.value) {
                if (current.leftChild != null) {
                    current = current.leftChild;
                } else {
                    current.leftChild = node;
                    break;
                }
            } else {
                if (current.rightChild != null) {
                    current = current.rightChild;
                } else {
                    current.rightChild = node;
                    break;
                }
            }
        }

    }


    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (current.value == value)
                return true;

            if (current.value > value) {
                    current = current.leftChild;
            } else {
                    current = current.rightChild;
            }
        }

        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    public int height() {
        return height(root);
    }

    // This is for Binary Search tree O(log n)
    public int minBinarySearchTree() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        Node current = root;
        Node last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }

        return last.value;
    }

    // This is for Binary Tree O(n)
    public int min() {
        return min(root);
    }

    public boolean equals(Tree other) {
        if (other == null)
            return false;

        return equals(root, other.root);
    }

    public void swapRoot() {
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    public boolean validate() {
        return validate(root);
    }

    public List<Integer> kDistance(int distance) {
        List<Integer> list = new ArrayList<>();
        kDistance(root, distance, list);
        return list;
    }

    public void traverseLevelOrder() {
        for (int i = 0; i <= height(); i++) {
            for (int value : kDistance(i))
                System.out.println(value);
        }
    }

    private void kDistance(Node root, int distance, List<Integer> list) {
        if (root == null)
            return;

        if (distance == 0) {
            list.add(root.value);
            return;
        }

        kDistance(root.leftChild, distance - 1, list);
        kDistance(root.rightChild, distance - 1, list);
    }

    private boolean validate(Node root) {
        if (root == null)
            return true;

        if (isLeaf(root))
            return true;

        return root.value > root.leftChild.value && root.value < root.rightChild.value
                && validate(root.leftChild)
                && validate(root.rightChild);
    }

    private boolean equals(Node first, Node second) {
        if (first == null & second == null)
            return true;

        if (first != null && second != null) {
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }

        return false;
    }

    private int min(Node root) {
        if (isLeaf(root))
            return root.value;

        int left = min(root.leftChild);
        int right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(height(root.rightChild), height(root.leftChild));
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.value + ", ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.print(root.value + ", ");
        traverseInOrder(root.rightChild);
    }

    private void traversePostOrder(Node root) {
        if (root == null) {
            return;
        }

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value + ", ");
    }

    private boolean isEmpty() {
        return root == null;
    }
}
