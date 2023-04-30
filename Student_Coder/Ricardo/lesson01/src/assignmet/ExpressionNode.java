package assignmet;

import java.util.Stack;

public class ExpressionNode {
    char value;
    ExpressionNode left, right;
    public ExpressionNode(char value) {
        this.value = value;
        left = right = null;
    }

    public static ExpressionNode convert(String postfix) {
        Stack<ExpressionNode> stack = new Stack<ExpressionNode>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (Character.isDigit(c)) {
                ExpressionNode node = new ExpressionNode(c);
                stack.push(node);
            } else {
                ExpressionNode right = stack.pop();
                ExpressionNode left = stack.pop();
                ExpressionNode node = new ExpressionNode(c);
                node.left = left;
                node.right = right;
                stack.push(node);
            }
        }
        return stack.pop();
    }

    public static String prefix(ExpressionNode root) {
        if (root == null) {
            return "";
        }
        return root.value + prefix(root.left) + prefix(root.right);
    }

    public static String infix(ExpressionNode root) {
        if (root == null) {
            return "";
        }

        if (root.left == null && root.right == null) {
            return Character.toString(root.value);
        }

        String left = infix(root.left);
        String right = infix(root.right);

        return "(" + left + root.value + right + ")";
    }

    public static String postfix(ExpressionNode root) {
        if (root == null) {
            return "";
        }
        return postfix(root.left) + postfix(root.right) + root.value;
    }
}
