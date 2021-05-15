package stacks;

import java.util.Stack;

public class ReverseString {
    public String reverse(String input) {
        if (input == null) throw new IllegalArgumentException();

        Stack<Character> charStack = new Stack<>();
        for (char ch : input.toCharArray()) {
            charStack.push(ch);
        }

        StringBuffer reverseBufferStr = new StringBuffer();
        while (!charStack.isEmpty()) {
            reverseBufferStr.append(charStack.pop());
        }

        return reverseBufferStr.toString();
    }
}
