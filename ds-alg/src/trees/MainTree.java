package trees;

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(6);
        tree.insert(4);
        tree.insert(1);

        System.out.println(tree.find(3));
//        System.out.println(tree);
    }
}
