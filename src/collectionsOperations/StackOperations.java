package collectionsOperations;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        reverseString("Avetis");
    }

    // 16. Reverse a string by pushing characters onto a stack and popping them back.
    static void reverseString(String s){
        Stack <Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            reversed.append(stack.pop());
        }
        System.out.println("Reversed string: " + reversed);
    }
}