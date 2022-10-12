/**
 * @ClassName: ifElseNest
 * @Description: TODO
 * @Author: AI悦创
 * @Date: 2022/10/10 09:16
 * @Version: V1.0
 * @Blog: https://www.bornforthis.cn
 */
public class ifElseNest {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int c = 99;

        System.out.println("a=" + a + ". b=" + b + ". c=" + c);
        if (a == b && b == c) {
            // a, b 和 c 是等大的
            System.out.println("a,b,c 三个数等大。");
        } else if (a > b) {
            if (a > c) {
                System.out.println("a 是最大数。");
            } else if (a == c) {
                System.out.println("a 和 c 是等大。");
            } else {
                System.out.println("c 是最大的数。");
            }

        } else if (b > c) {
            if (a == b) {
                System.out.println("a 和 b 是等大的数。");
            } else {
                System.out.println("b 是最大的数。");
            }
        } else if (b == c) {
            System.out.println("b 和 c 等大。");
        } else {
            System.out.println("c 是最大的数。");
        }
    }

}
