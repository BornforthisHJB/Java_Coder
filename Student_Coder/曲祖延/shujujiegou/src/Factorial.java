/**
 * @ClassName: Factorial
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/3/4 23:31
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 5; // 要计算阶乘的整数 n
        int result = factorial(n);
        System.out.println(n + "! = " + result);
    }

    public static int factorial(int n) {
        int result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }
}
