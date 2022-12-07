/**
 * @ClassName: BooleanOprt
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/12 22:40
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class BooleanOprt {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a | b);
        System.out.println(a || b);
//        System.out.println(a || (10 / 0 > 1)); // true
        System.out.println(false && (10 / 0) > 1);
    }
}
