/**
 * @ClassName: CompareOprt
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/10 01:45
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class CompareOprt {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 10;

        System.out.println(a > b);  //  false
        System.out.println(a >= b); // false
        System.out.println(a < b); //
        System.out.println(a <= b); //
        System.out.println(a != b); //

        System.out.println(a != c);
        System.out.println(a >= c);
        System.out.println(a <= c);
        System.out.println(a == b);
        System.out.println(a == c);

    }
}
