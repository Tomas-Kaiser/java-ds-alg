package trees;

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

    private boolean isEmpty() {
        return root == null;
    }
}
