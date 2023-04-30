/**
 * @ClassName: Calculator
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/3/9 08:19
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
import java.util.*;
/*
* 计算后缀表达式的计算器类
* */
public class Calculator {
    // 后缀表达式
//    private String postfixExpr;
    private final String postfixExpr;

    /*
    * 构造函数
    * @param postfixExpr 后缀表达式*/
    public Calculator(String postfixExpr) {
        this.postfixExpr = postfixExpr;
    }

    /*
    * 计算后缀表达式的值
    * @return 后缀表达式的值
    * */
    public double evaluate() {
        // 用于存储操作数的栈
        Stack<Double> operandStack = new LinkedStack<>();

        // 用空白符分割后缀表达式
        for (String token: postfixExpr.split("\\s+")) {
            // 正则判断 如果 token 字符串是操作数--->>>入栈
            if (token.matches("\\d+")) {
                // 将字符串转换为 double 类型
                operandStack.push(Double.parseDouble(token));
            } else {
                // 如果是运算符，从栈中弹出两个操作数，进行运算，将运算结果入栈
                double op2 = operandStack.pop();
                double op1 = operandStack.pop();
                // 进行运算，将运算结果入栈
                switch (token) {
                    // 如果是 + - * / ^ 运算符，进行运算，并将运算结果入栈
                    case "+": operandStack.push(op1 + op2); break;
                    case "-": operandStack.push(op1 - op2); break;
                    case "*": operandStack.push(op1 * op2); break;
                    case "/": operandStack.push(op1 / op2); break;
                    case "^": operandStack.push(Math.pow(op1, op2)); break;
                    // 如果是无效的运算符，抛出异常
                    default: throw new IllegalArgumentException("Invalid token: " + token);
                }
            }
        }
        // 返回栈顶元素，即为后缀表达式的值
        return operandStack.pop();

    }
}
