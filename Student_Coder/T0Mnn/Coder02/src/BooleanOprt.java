/**
 * @ClassName: BooleanOprt
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/17 18:30
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class BooleanOprt {
    public static void main(String[] args) {
        // 我们也可以使用比较运算符生成的 boolean 来进行比较
        boolean a = true; //  1 < 2
        boolean b = false;

        System.out.println(a && b);  // false
        System.out.println(a & b);  // false
        System.out.println(a || b); // true
        System.out.println(a | b);  // true

        System.out.println(a || (10 / 0 > 1));
        System.out.println(false && (10 / 0 > 1));



    }
}
