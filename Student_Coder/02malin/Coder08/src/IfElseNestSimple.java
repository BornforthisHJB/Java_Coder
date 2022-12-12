/**
 * @ClassName: IfElseNestSimple
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/12 09:33
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class IfElseNestSimple {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 99;

        System.out.println("a=" + a + ".b=" + b + ".c=" + c);
        if (a == b && b == c) {
            System.out.println("a,b,c等大");
        } else if (a > b && a > c) {
            System.out.println("max value is a.");
        } else if (b > a && b > c) {
            System.out.println("b is max value");
        } else if (c > a && c > b) {
            System.out.println("c is max value.");
        } else if (a == b && b > c) {
            System.out.println("a and b is ==");
        } else if (b == c && b > a) {
            System.out.println("b and c 等大最大");
        } else if (a == c && b > c) {
            System.out.println("a and c is 等大");
        }
    }
}
