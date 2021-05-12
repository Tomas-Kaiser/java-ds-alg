package arrays.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SyntaxCheck {
    private static List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private static List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

    public boolean isValid(String input){
        if (input == null) throw new IllegalArgumentException();

        Stack<Character> charStack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                charStack.push(ch);
            }

            if (isRightBracket(ch)) {
                if (charStack.isEmpty()) return false;

                if (!bracketsMatch(charStack.pop(), ch)){
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
