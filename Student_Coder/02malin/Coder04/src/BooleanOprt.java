/**
 * @ClassName: BooleanOprt
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/10 02:00
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class BooleanOprt {
    public static void main(String[] args) {
        boolean a = true; // 1 < 2
        boolean b = false; // 1 > 2
        System.out.println(a & b); // false
        System.out.println(a && b); // false
        System.out.println(a | b); // true
        System.out.println(a || b); // true
        System.out.println(!a);
        System.out.println(!b);


    }
}
