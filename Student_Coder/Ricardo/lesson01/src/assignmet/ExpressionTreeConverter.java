package assignmet;

import java.util.*;
import static assignmet.ExpressionNode.*;

/**
 * 用于将中缀表达式转换为后缀表达式
 *
 */
public class ExpressionTreeConverter {
    /**
     * main函数
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type your expression: ");
            String input = scanner.nextLine();
            if ("".equals(input)) {
                break;
            }

            String postfix = convert(input);
            ExpressionNode root = ExpressionNode.convert(postfix);
            System.out.println("Prefix: " + prefix(root));
            System.out.println("Infix: " + infix(root));
            System.out.println("Postfix: " + postfix(root));
        }
    }


    /**
     * 中缀表达式转换为后缀表达式
     * @param infix    中缀表达式
     * @return         后缀表达式
     */
    public static String convert(String infix) {
        // 用于存储运算符的栈
        Stack<Character> operatorStack = new Stack<>();
        // 用于存储后缀表达式的字符串
        StringBuilder postfix = new StringBuilder();
        // 遍历中缀表达式
        for (char c : infix.toCharArray()) {
            // 如果是数字，直接添加到后缀表达式中
            if (Character.isDigit(c)) {
                postfix.append(c);
                // 如果是运算符
            } else if (c == '(') {
                // 左括号直接入栈
                operatorStack.push(c);
            } else if (c == ')') {
                // 如果是右括号，将栈中的运算符弹出，直到遇到左括号
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                // 如果栈不为空且栈顶是左括号，将左括号弹出
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop();
                }
            } else {
                // 如果是其他运算符，将栈中的运算符弹出，直到遇到优先级低于当前运算符的运算符
                while (!operatorStack.isEmpty() && precedence(c) <= precedence(operatorStack.peek())) {
                    postfix.append(operatorStack.pop());
                }
                // 将当前运算符入栈
                operatorStack.push(c);
            }
        }
        // 将栈中剩余的运算符弹出
        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }
        // 返回后缀表达式
        return postfix.toString();
    }

    /**
     * 获取运算符的优先级
     * @param operator 运算符
     * @return        优先级
     */
    private static int precedence(char operator) {
        // 如果是加减，优先级为1
        if (operator == '+' || operator == '-') {
            return 1;
            // 如果是乘除，优先级为2
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            // 其他情况，优先级为0
            return 0;
        }
    }


}
