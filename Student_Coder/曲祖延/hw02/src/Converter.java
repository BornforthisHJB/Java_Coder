
import java.util.*;

/**
 * 中缀表达式转后缀表达式
 */
public class Converter {
    /**
     * 中缀表达式
     */
    private String infixExpr;

    /**
     * 中缀表达式转换为token列表
     */
    private List<String> tokens;

    /**
     * 构造函数
     * 字符串转换为token
     *
     * @param infixExpr
     */
    public Converter(String infixExpr) {
        this.infixExpr = infixExpr;
        this.tokens = ParserHelper.parse(infixExpr.toCharArray());
    }

    /**
     * 中缀表达式转后缀表达式
     *
     * @return
     */

    public String toPostfix() {
        Stack<String> operatorStack = new LinkedStack<>();
        StringBuilder postfixExpr = new StringBuilder();

        // 从左到右扫描中缀表达式
        for (String token : tokens) {
            // 如果是操作数， 直接输出
            if (token.matches("\\d+")) {
                postfixExpr.append(token).append(" ");
                // 如果是左括号，入栈
            } else if ("(".equals(token)) {
                operatorStack.push(token);
                // 如果是右括号，依次弹出栈顶操作符，直到遇到左括号，将左括号丢弃
            } else if (")".equals(token)) {
                while (!"(".equals(operatorStack.peek())) {
                    postfixExpr.append(operatorStack.pop()).append(" ");
                }
                operatorStack.pop();
                // 如果是运算符，依次弹出栈顶操作符，直到遇到比当前运算符优先级低的操作符，将当前运算符入栈
            } else {
                while (!operatorStack.isEmpty() && hasLowerPrecedence(operatorStack.peek(), token)) {
                    postfixExpr.append(operatorStack.pop()).append(" ");
                }
                operatorStack.push(token);
            }
        }
        // 将栈中剩余的操作符依次弹出
        while (!operatorStack.isEmpty()) {
            postfixExpr.append(operatorStack.pop()).append(" ");
        }

        // 返回后缀表达式
        return postfixExpr.toString().trim();
    }

    /**
     * 判断op1是否比op2优先级低
     *
     * @param op1
     * @param op2
     * @return
     */
    private boolean hasLowerPrecedence(String op1, String op2) {
        int p1 = getPrecedence(op1);
        int p2 = getPrecedence(op2);
        return p1 >= 0 && p2 >= 0 && p1 >= p2;
    }

    /**
     * 获取操作符的优先级
     * 优先级从高到低依次为：
     * "^" > "*" == "/" > "+" == "-
     *
     * @param op
     * @return
     */
    private int getPrecedence(String op) {
        switch (op) {
            case "^":
                return 3;
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
            // 如果不是运算符，返回-1
            default:
                return -1;
        }
    }
}