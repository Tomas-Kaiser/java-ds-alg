package trees;

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(10);
        tree.insert(8);
        tree.insert(6);
        tree.insert(1);

        System.out.println(tree.height());

//        System.out.println("Pre order: ");
//        tree.traversePreOrder();
//
//        System.out.println();
//        System.out.println();
//        System.out.println("In order: ");
//        tree.traverseInOrder();
//
//        System.out.println();
//        System.out.println();
//        System.out.println("Post order: ");
//        tree.traversePostOrder();
    }



    /*
    *
    *       FACTORIAL WITH ITERATION & RECURSION
    *
    * */

//    public static int factorial(int n) {
//        // Base condition
//        if (n == 0)
//            return 1;
//
//        return n * factorial(n - 1);
//    }

//    public static int factorial(int n) {
//        int factorial = 1;
//        for (int i = n; i > 0; i--) {
//            factorial *= i;
//        }
//
//        return factorial;
//    }
}
