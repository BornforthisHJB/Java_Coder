/**
 * @ClassName: PostfixCalculator
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/3/11 09:21
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
import java.util.Scanner;

public class PostfixCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type your infix expression:");
        String infixExpr = scanner.nextLine();
        scanner.close();

        Converter converter = new Converter(infixExpr);
        String postfixExpr = converter.toPostfix();
        System.out.println("Converted to postfix: " + postfixExpr);

        Calculator calculator = new Calculator(postfixExpr);
        double result = calculator.evaluate();
        System.out.println("answer is " + result);
    }
}
