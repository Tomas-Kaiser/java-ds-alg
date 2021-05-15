package stacks;

public class MainStack {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(4);
        stack.push(2);
        stack.push(1);

        stack.pop();
        stack.pop();
//        stack.pop();

//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());

        System.out.println(stack.getMin());
//        stack.printMins();

        System.out.println(stack);



        // Syntax validation
//        SyntaxCheck syntaxCheck = new SyntaxCheck();
//        System.out.println(syntaxCheck.isValid("((1 + 3))<9>"));


        // Reverse a String using Stack
//        ReverseString reverseString = new ReverseString();
//        System.out.println(reverseString.reverse("abcd"));
    }

}
