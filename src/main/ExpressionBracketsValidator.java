package main;

import stack.StackInterface;
import stack.array.ArrayStack;

import java.util.Stack;

public class ExpressionBracketsValidator {

    public static boolean isValidExpression(String expression) {
        StackInterface<Character> stack = new ArrayStack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || !stack.peek().equals('(')) {
                    return false;
                }
                stack.pop();
            }else if (c == '}') {
                if (stack.isEmpty() || !stack.peek().equals('{')) {
                    return false;
                }
                stack.pop();
            }
            else if (c == ']') {
                if (stack.isEmpty() || !stack.peek().equals('[')) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String[] expressions = new String[]{
                "(a + b(c[0] - d[0+1]) - (a - b[1 - 2(3 + d[4])]))",
                "(a * (b + c[0])) - (d[1] + b)",
                "(a + b * (c[0] - d[0 + 1])) - (a - b[1 - 2*(3 + d[4]) + d[3]])",
                "(a + b * (c[0] - d[0+1]) - (a - b[1 - 2*(3 + d[4]))",
                "(a + b * c[0 - d[4] - 3) + 1]"
        };
        for (String expression : expressions) {
            System.out.printf("Expression: %s validity is %b\n", expression,isValidExpression(expression));
        }
    }
}
